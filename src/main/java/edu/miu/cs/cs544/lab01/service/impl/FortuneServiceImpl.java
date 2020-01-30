package edu.miu.cs.cs544.lab01.service.impl;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import edu.miu.cs.cs544.lab01.dao.Fortune;
import edu.miu.cs.cs544.lab01.dao.Greeting;
import edu.miu.cs.cs544.lab01.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class FortuneServiceImpl implements FortuneService {
    private Random rand = new Random();


    @Value("${fortuneservice.url}")
    private String fortuneUrl;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "defaultFallback")
    public Greeting getFortune() {
        Fortune fortune = restTemplate.getForObject("http://fortune/getFortune", Fortune.class);
        return new Greeting("Greeting",fortune );
    }

    public Greeting defaultFallback(){
        return new Greeting("Hi", new Fortune(3, "Your fortune is uncertain"));
    }
}
