package com.bas.chatapplication.auth;

import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AuthenticationControllerTests {

    @MockBean
    AuthenticationController authetnicationController = new AuthenticationController();

    @MockBean
    AuthenticationService authetnicationService = new AuthenticationService();

    @Test
    void testRegister() {

        /*request.put("firstname", "bas");
        request.put("lastname", "onrust");
        request.put("email", "bas@user.com");
        request.put("password", "12345");*/

        var response = authetnicationService.register(request);

        Assertions.assertNotNull(response);

        Assertions.assertInstanceOf(String.class, response.getSecretImageUri());
        Assertions.assertInstanceOf(String.class, response.getAccessToken());
        Assertions.assertInstanceOf(String.class, response.getRefreshToken());
        Assertions.assertFalse(response.isMfaEnabled());

        Assertions.assertEquals(HttpStatus.ACCEPTED, response);
    }

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
