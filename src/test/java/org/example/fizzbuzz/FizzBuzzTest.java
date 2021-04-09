package org.example.fizzbuzz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void parrotTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.fizzBuzz(1));
    }

    @Test
    void returnFizzTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.fizzBuzz(3));
        assertEquals("Fizz", fb.fizzBuzz(6));
    }

    @Test
    void returnBuzzTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.fizzBuzz(5));
        assertEquals("Buzz", fb.fizzBuzz(10));
    }

    @Test
    void returnFizzBuzzTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.fizzBuzz(15));
        assertEquals("FizzBuzz", fb.fizzBuzz(30));
    }

    @Nested
    class Range {
        @AllArgsConstructor
        @Getter
        @Accessors(fluent = true)
        class TestCase {
            private final int inputValue;
            private final String expected;
        }

        @TestFactory
        Stream<DynamicNode> testFizzBuzz() {
            return Stream.of(
                    new TestCase(1, "1"),
                    new TestCase(2, "2"),
                    new TestCase(3, "Fizz"),
                    new TestCase(4, "4"),
                    new TestCase(5, "Buzz"),
                    new TestCase(6, "Fizz"),
                    new TestCase(7, "7"),
                    new TestCase(8, "8"),
                    new TestCase(9, "Fizz"),
                    new TestCase(10, "Buzz"),
                    new TestCase(11, "11"),
                    new TestCase(12, "Fizz"),
                    new TestCase(13, "13"),
                    new TestCase(14, "14"),
                    new TestCase(15, "FizzBuzz"),
                    new TestCase(16, "16")
            ).map(testCase -> DynamicTest.dynamicTest(
                    "1から16までテスト",
                    () -> {
                        FizzBuzz fb = new FizzBuzz();
                        assertEquals(testCase.expected(), fb.fizzBuzz(testCase.inputValue()));
                    }
            ));
        }
    }
}
