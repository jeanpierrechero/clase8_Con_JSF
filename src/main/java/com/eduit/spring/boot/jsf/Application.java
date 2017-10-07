package com.eduit.spring.boot.jsf;

import com.eduit.spring.boot.jsf.scope.SessionReplicationAwareScopeMetadataResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Call http://localhost:8080/index.xhtml after starting the application.
 * 
 * @author MIS
 *
 */
@SpringBootApplication
@ComponentScan(scopeResolver = SessionReplicationAwareScopeMetadataResolver.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
