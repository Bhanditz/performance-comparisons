package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_158 {
    private final Production87_158 production = new Production87_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}