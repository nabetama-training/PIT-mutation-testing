package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

class SingletonTest {
    @Test
    void ThereAreOnlyOneInstance() {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        assertThat(a, is(b));
        assertThat(a, is(notNullValue()));
    }
}
