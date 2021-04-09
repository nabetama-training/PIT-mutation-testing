package org.example.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void parrotTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.fizzBuzz(1));
    }
}
