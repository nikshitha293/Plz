package com.javabytest.Springdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*") // 👈 This allows frontend JS to call backend
@RestController
public class WelcomeController {

    @GetMapping("/api/message")
    public String getMessage() {
        return "Hello World From qwertysqi";
    }
}
