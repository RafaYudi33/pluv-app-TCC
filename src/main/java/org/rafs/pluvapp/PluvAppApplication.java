package org.rafs.pluvapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PluvAppApplication {
    //java -javaagent:"C:/Program Files/New Relic/newrelic.jar" -jar pluv-app-0.0.1-SNAPSHOT.jar --spring.profiles.active=relational
    public static void main(String[] args) {
        SpringApplication.run(PluvAppApplication.class, args);
    }

}
