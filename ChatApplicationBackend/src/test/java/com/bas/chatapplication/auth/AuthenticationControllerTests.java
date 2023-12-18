package com.bas.chatapplication.auth;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.bas.chatapplication.user.Role.ADMIN;

@SpringBootTest
class AuthenticationControllerTests {

    @Autowired
    AuthenticationService authenticationService;

    @Test
    void testRegister() {
        var admin = RegisterRequest.builder()
            .firstname("admin")
            .lastname("admin")
            .email("admin@email.com")
            .password("password")
            .role(ADMIN)
            .build();

        var response = authenticationService.register(admin);

        Assertions.assertNotNull(response);
        Assertions.assertInstanceOf(String.class, response.getSecretImageUri());
        Assertions.assertInstanceOf(String.class, response.getAccessToken());
        Assertions.assertInstanceOf(String.class, response.getRefreshToken());
        Assertions.assertFalse(response.isMfaEnabled());
    }
}
