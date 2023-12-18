package com.bas.chatapplication.auth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AuthenticationControllerTests {

    /*@MockBean
    AuthenticationController authetnicationController = new AuthenticationController();

    @MockBean
    AuthenticationService authetnicationService = new AuthenticationService();

    @Test
    void testRegister() {
        ResponseEntity<Object> request = ;

        var response = authetnicationService.register(request);

        Assertions.assertNotNull(response);
        Assertions.assertInstanceOf(String.class, response.secretImageUri);
        Assertions.assertInstanceOf(String.class, response.accessToken);
        Assertions.assertInstanceOf(String.class, response.refreshToken);
        Assertions.assertEquals(false, response.mfaEnabled);
    }*/

    /*@Test
    void testAuthenticate() {
        //ResponseEntity<Object> request = ;

        //var response = authetnicationService.authenticate(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void testVerifyCode() {
        //ResponseEntity<Object> request = ;

        //var response = authetnicationService.verifyCode(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }*/
}
