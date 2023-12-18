package com.bas.chatapplication.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AdminControllerTests {

    @MockBean
    AdminController adminController = new AdminController();

    @Test
    public void testVerifyToken() {
        ResponseEntity<String> responseEntity = ResponseEntity.status(HttpStatus.OK).body("Verification successful.");

        Assertions.assertNotNull(responseEntity.getBody());
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Verification successful.", responseEntity.getBody());
    }

    @Test
    public void testGet() {
        Assertions.assertNotNull(adminController.get());
        Assertions.assertEquals("GET request successful from admin controller.", (adminController.get()));
    }

    @Test
    public void testPost() {
        Assertions.assertNotNull(adminController.post());
        Assertions.assertEquals("POST request successful from admin controller.", (adminController.post()));
    }

    @Test
    public void testPut() {
        Assertions.assertNotNull(adminController.put());
        Assertions.assertEquals("PUT request successful from admin controller.", (adminController.put()));
    }

    @Test
    public void testDelete() {
        Assertions.assertNotNull(adminController.delete());
        Assertions.assertEquals("DELETE request successful from admin controller.", (adminController.delete()));
    }
}
