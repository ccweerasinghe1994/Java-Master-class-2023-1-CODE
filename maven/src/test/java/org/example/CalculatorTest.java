package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

        @Test
        void add() {
            Calculator calculator = new Calculator();
            int result = calculator.add(1, 2, 3);
            assertEquals(6, result);
        }
}