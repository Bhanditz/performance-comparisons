package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_419 {
    private final Production87_419 production = new Production87_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}