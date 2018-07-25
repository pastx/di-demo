package pastx.guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;
import pastx.guru.springframework.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
