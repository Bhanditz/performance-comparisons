package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_285 {
    private final Production87_285 production = new Production87_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}