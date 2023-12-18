package com.bas.chatapplication.config;

import jakarta.validation.constraints.AssertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.BooleanSupplier;

@SpringBootTest
public class ApplicationConfigurationTests {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    @Test
    void testUserDetailsService() {
        var response = applicationConfiguration.userDetailsService();

        Assertions.assertInstanceOf(Object.class, response);
    }
}
