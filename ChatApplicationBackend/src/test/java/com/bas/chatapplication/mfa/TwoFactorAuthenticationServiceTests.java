package com.bas.chatapplication.mfa;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@RequiredArgsConstructor
@SpringBootTest
public class TwoFactorAuthenticationServiceTests {

    @Test
    void testIsOtpValid() {
        String secret = "c606de64c81a4c4e8549bac747ef5d15cef225efcbc79d15d3331f018614ea86";
        String code = "123456";
        TwoFactorAuthenticationService twoFactorAuthenticationService = new TwoFactorAuthenticationService();

        Assertions.assertNotEquals(true, twoFactorAuthenticationService.isOtpValid(secret, code));
    }
}
