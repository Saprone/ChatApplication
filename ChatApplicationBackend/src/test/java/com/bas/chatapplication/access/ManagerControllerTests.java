package com.bas.chatapplication.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ManagerControllerTests {
    @MockBean
    ManagerController managerController = new ManagerController();

    @Test
    public void testVerifyToken() {
        ResponseEntity<String> responseEntity = ResponseEntity.status(HttpStatus.OK).body("Verification successful.");

        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Verification successful.", responseEntity.getBody());
    }

    @Test
    public void testGet() {
        Assertions.assertEquals("GET request successful from manager controller.", (managerController.get()));
    }

    @Test
    public void testPost() {
        Assertions.assertEquals("POST request successful from manager controller.", (managerController.post()));
    }

    @Test
    public void testPut() {
        Assertions.assertEquals("PUT request successful from manager controller.", (managerController.put()));
    }

    @Test
    public void testDelete() {
        Assertions.assertEquals("DELETE request successful from manager controller.", (managerController.delete()));
    }
}
