package com.microservice.service.hystric;

import com.microservice.service.AppointServiceHi;
import org.springframework.stereotype.Component;

@Component
public class AppointServiceHiHystric implements AppointServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry! "+name;
    }
}
