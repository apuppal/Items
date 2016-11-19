package com.anup.poc.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.datastax.driver.core.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ravi.poc.cassandra.CassandraConnector;
import com.ravi.poc.model.Product;
import com.ravi.poc.model.ProductCompositeResponse;
import com.ravi.poc.model.v3.ProductV3;


@RestController
@RequestMapping("/products")
public class ProductIdController {
    
    @Autowired
    CassandraConnector cassandraConnector;
    
    public static final String SELECT_QUERY =
            "Select product_price" +
                    " ,product_name" +
                    " from" +
                    " product_price" +
                    " where"
                    + " product_id = ?";
    
    //private Product product;
    private static String text;
    public Product product1 = new Product();
    
    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public String product(@PathVariable Long id){
        
        product1.setId(id);
        //product1.setName("Ravi");
        productName(id);
        productPrice(id);
        return product1.toString();

    }
    
    public String productName(long id){
        
        RestTemplate resttemplate = new RestTemplate();
        ProductCompositeResponse productv3 = new ProductCompositeResponse();
  
        final String uri = "https://api.target.com/products/v3/"+id+"?fields=descriptions&id_type=TCIN&key=43cJWpLjH8Z8oR18KdrZDBKAgLLQKJjz";
        
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
         
        ResponseEntity<?> result = resttemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        System.out.println(result);
        String body = result.getBody().toString();
        
        
        //Mapping the output to JSON Objects
        ObjectMapper mapper = new ObjectMapper();
        try {
            productv3 = mapper.readValue(body, ProductCompositeResponse.class);
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Hey new Product V3 object is : "+ productv3.toString());
        System.out.println("Success");
        return "yes";        
    }
    
    
    public String productPrice(long id){
        try {
            Session session = cassandraConnector.createSession();
            PreparedStatement preparedStatement = session.prepare(SELECT_QUERY);
            BoundStatement boundStatement = new BoundStatement(preparedStatement);
            boundStatement.setInt(0, (int) id);
            ResultSet rs = session.execute(boundStatement);
            if (!rs.isExhausted()) {
                for (Row row : rs) {
                    product1.setPrice(row.getInt("product_price"));
                    product1.setName(row.getString("product_name"));
                }
            }
        } catch (Exception e) {
           System.out.println("error while retrieving EMU records for experian ");
        } finally {
            cassandraConnector.closeConnection();
        }
        return "yes";
    }
    
    

}
