package com.mld.springboot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Springboot11ActuatoruiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot11ActuatoruiApplication.class, args);
    }

}
