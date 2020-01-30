package edu.miu.cs.cs544.lab01.controller;

import edu.miu.cs.cs544.lab01.dao.Fortune;
import edu.miu.cs.cs544.lab01.dao.Greeting;
import edu.miu.cs.cs544.lab01.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImpl implements GreetingService {


    @Autowired
    private FortuneService fortuneService;
    @RequestMapping("/")
    public Greeting getFortune(){
       return  fortuneService.getFortune();
    }
}
