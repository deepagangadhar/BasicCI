package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAppMessage() {
        String message = "Hello from Maven project!";
        assertEquals("Hello from Maven project!", message);
    }

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

}
