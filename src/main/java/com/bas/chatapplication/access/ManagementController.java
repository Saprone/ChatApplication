package com.bas.chatapplication.access;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {

    @GetMapping
    public String get() {
        return "GET request successful from management controller.";
    }

    @PostMapping
    public String post() {
        return "POST request successful from management controller.";
    }

    @PutMapping
    public String put() {
        return "PUT request successful from management controller.";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE request successful from management controller.";
    }
}
