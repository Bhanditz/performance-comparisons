package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_171 {
    private final Production23_171 production = new Production23_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}