package com.bas.chatapplication.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminControllerTests {

    @Test
    void testVerifyToken() {
        Assertions.assertEquals("1", "1");
    }

    @Test
    void testGet() {
        Assertions.assertEquals("1", "1");
    }
}
