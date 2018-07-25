package pastx.guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from getter greeting service";
    }
}
