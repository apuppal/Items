package com.anup.poc.cassandra;

import org.springframework.stereotype.Component;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Value;

@Component
public class CassandraConnector {
    
    @Value("${cassandra.username}")
    private String username;
    @Value("${cassandra.password}")
    private String password;
    @Value("${cassandra.keyspace}")
    private String keyspacename;
    @Value("${cassandra.urls}")
    private String urls;
    
    Cluster cluster = null;
    Session session = null;

    /**
     * Method to initialize session with Cassandra cluster. DCAwareRoundRobinPolicy
     * is used for loadbalancing
     */
    private void initializeSession() {
        initializeCluster();
        session = cluster.connect(keyspacename);
    }

    /**
     * method to initialize cluster
     */
    private void initializeCluster() {
        cluster = Cluster.builder().withCredentials(username, password).addContactPoints(urls).build();
    }

    /**
     * Method to get session. If session is null it will establish the
     * connection first and then returns the session
     *
     * @return
     */
    public Session createSession() {
        if (null == session) {
            initializeSession();
        }
        return session;
    }

    /**
     * Method to close connection with Cassandra cluster
     */
    public void closeConnection() {
        session = null;
        if(cluster != null) {
            cluster.close();
        }
        cluster = null;
    }


}
