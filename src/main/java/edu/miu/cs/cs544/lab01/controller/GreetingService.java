package edu.miu.cs.cs544.lab01.controller;

import edu.miu.cs.cs544.lab01.dao.Fortune;
import edu.miu.cs.cs544.lab01.dao.Greeting;

public interface GreetingService {
    public Greeting getFortune();
}
