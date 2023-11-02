package com.bas.chatapplication.access;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping
    public String get() {
        return "GET request successful from admin controller.";
    }

    @PostMapping
    public String post() {
        return "POST request successful from admin controller.";
    }

    @PutMapping
    public String put() {
        return "PUT request successful from admin controller.";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE request successful from admin controller.";
    }
}
