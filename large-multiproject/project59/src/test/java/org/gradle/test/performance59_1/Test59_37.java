package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_37 {
    private final Production59_37 production = new Production59_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}