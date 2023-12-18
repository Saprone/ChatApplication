package com.bas.chatapplication.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationConfigurationTests {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    @Test
    void testUserDetailsService() {
        var response = applicationConfiguration.userDetailsService();

        Assertions.assertInstanceOf(Object.class, response);
    }

    @Test
    void testAuthenticationProvider() {
        var response = applicationConfiguration.authenticationProvider();

        Assertions.assertInstanceOf(Object.class, response);
    }

    @Test
    void testPasswordEncoder() {
        var response = applicationConfiguration.passwordEncoder();

        Assertions.assertInstanceOf(Object.class, response);
        Assertions.assertInstanceOf(String.class, response.encode("test"));
        Assertions.assertTrue(response.matches("test", response.encode("test")));
    }
}
