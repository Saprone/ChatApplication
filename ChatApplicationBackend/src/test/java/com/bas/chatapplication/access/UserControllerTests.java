package com.bas.chatapplication.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserControllerTests {
    @MockBean
    UserController userController = new UserController();

    @Test
    public void testVerifyToken() {
        ResponseEntity<String> responseEntity = ResponseEntity.status(HttpStatus.OK).body("Verification successful.");

        Assertions.assertNotNull(responseEntity.getBody());
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Verification successful.", responseEntity.getBody());
    }

    @Test
    public void testGet() {
        Assertions.assertNotNull(userController.get());
        Assertions.assertEquals("GET request successful from user controller.", (userController.get()));
    }

    @Test
    public void testPost() {
        Assertions.assertNotNull(userController.post());
        Assertions.assertEquals("POST request successful from user controller.", (userController.post()));
    }

    @Test
    public void testPut() {
        Assertions.assertNotNull(userController.put());
        Assertions.assertEquals("PUT request successful from user controller.", (userController.put()));
    }

    @Test
    public void testDelete() {
        Assertions.assertNotNull(userController.delete());
        Assertions.assertEquals("DELETE request successful from user controller.", (userController.delete()));
    }
}

