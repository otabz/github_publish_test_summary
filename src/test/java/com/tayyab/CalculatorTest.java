package com.tayyab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoPositiveIntegers() {
        assertEquals(5, new Calculator().addTwoIntegers(2, 3));
    }
}