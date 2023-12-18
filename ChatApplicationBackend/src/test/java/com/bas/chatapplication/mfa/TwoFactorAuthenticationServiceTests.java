package com.bas.chatapplication.mfa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TwoFactorAuthenticationServiceTests {

    @Mock
    private TwoFactorAuthenticationService twoFactorAuthenticationService;
    String secret = "c606de64c81a4c4e8549bac747ef5d15cef225efcbc79d15d3331f018614ea86";

    @Test
    void testIsOtpValid() {
        String code = "123456";
        var response = twoFactorAuthenticationService.isOtpValid(secret, code);

        Assertions.assertInstanceOf(Boolean.class, response);
        Assertions.assertFalse(response);
    }
}
