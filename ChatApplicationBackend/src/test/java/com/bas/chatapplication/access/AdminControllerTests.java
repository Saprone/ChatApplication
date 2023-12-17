package com.bas.chatapplication.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdminControllerTests {

    AdminController adminController;

    @Test
    public void testGet() {
        adminController = new AdminController();

        Assertions.assertEquals("GET request successful from admin controller." ,(adminController.get()));
    }
}
