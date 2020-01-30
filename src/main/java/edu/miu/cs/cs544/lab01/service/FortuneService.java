package edu.miu.cs.cs544.lab01.service;

import edu.miu.cs.cs544.lab01.dao.Fortune;
import edu.miu.cs.cs544.lab01.dao.Greeting;
import org.springframework.web.client.RestTemplate;

public interface FortuneService {
    public Greeting getFortune();
}
