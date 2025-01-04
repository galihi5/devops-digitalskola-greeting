package com.gaw.greeting.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    UserRepository userRepository;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @GetMapping("/hello")
    public String greetingNewUser() {
        Optional<User> user = userRepository.findLatest();

        if (user.isPresent()) {
            return String.format("Hello %s, you're registered at %s", user.get().getUsername(), user.get().getCreatedAt().format(formatter));
        } else {
            return "No Data Available";
        }
    }
}
