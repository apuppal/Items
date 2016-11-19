package com.anup.poc.model.v3;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductV3 {
    
    private ProductCompositeResponse productCompositeResponse;

    /**
    * 
    * @return
    * The productCompositeResponse
    */
    public ProductCompositeResponse getProductCompositeResponse() {
    return productCompositeResponse;
    }

    /**
    * 
    * @param productCompositeResponse
    * The product_composite_response
    */
    public void setProductCompositeResponse(ProductCompositeResponse productCompositeResponse) {
    this.productCompositeResponse = productCompositeResponse;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

}
