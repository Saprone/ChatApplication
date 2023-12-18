package com.bas.chatapplication.auth;

/*import com.bas.chatapplication.auth.AuthenticationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import static com.bas.chatapplication.user.Role.ADMIN;


public class AuthenticationControllerTests {

    @MockBean
    AuthenticationService authenticationService = new AuthenticationService();

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

        Assertions.assertEquals(HttpStatus.ACCEPTED, response);
    }

    @Test
    void testAuthenticate() {
        ResponseEntity<Object> request = ;

        var response = authetnicationService.authenticate(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void testVerifyCode() {
        ResponseEntity<Object> request = ;

        var response = authetnicationService.verifyCode(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}*/
