package com.vedavani.backend;

import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@CrossOrigin(origins = "*")
public class ChatController {

    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of(
            "status", "success",
            "message", "Vedavani backend is alive 🌿"
        );
    }
    
    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Hello from Vedavani API!"
        );
    }
}
