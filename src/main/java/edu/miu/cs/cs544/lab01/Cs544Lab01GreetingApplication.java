package edu.miu.cs.cs544.lab01;

import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableDiscoveryClient
public class Cs544Lab01GreetingApplication {


    public static void main(String[] args) {
        SpringApplication.run(Cs544Lab01GreetingApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public  RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
