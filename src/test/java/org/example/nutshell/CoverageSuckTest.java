package org.example.nutshell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoverageSuckTest {
    @Test
    void biggerThan10Test() {
        CoverageSuck suck = new CoverageSuck();

        Assertions.assertTrue(suck.biggerThan10(11));
        Assertions.assertFalse(suck.biggerThan10(9));
    }
}
