package com.bas.chatapplication.access;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/verify-token")
    public ResponseEntity<String> verifyToken() {
        return ResponseEntity.ok("Verification successful.");
    }

    @GetMapping
    public String get() {
        return "GET request successful from user controller.";
    }

    @PostMapping
    public String post() {
        return "POST request successful from user controller.";
    }

    @PutMapping
    public String put() {
        return "PUT request successful from user controller.";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE request successful from user controller.";
    }
}
