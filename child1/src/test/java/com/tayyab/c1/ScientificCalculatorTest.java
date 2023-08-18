package com.tayyab.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @Test
    void multiplyTwoIntegers() {
        assertEquals(20, new ScientificCalculator().multiply(4, 5));
    }
}