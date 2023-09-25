package com.siegfred.dctest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CLIApp implements CommandLineRunner {

    private final GreetingRepository greetingRepository;

    public CLIApp(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello");

        Optional<Greeting> greeting = greetingRepository.findById("morning");
        
        greeting.ifPresent(g -> {
            log.info(g.getMessage());
        });
        System.exit(0);
    }
    
}
