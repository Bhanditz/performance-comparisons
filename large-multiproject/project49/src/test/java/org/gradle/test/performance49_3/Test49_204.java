package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_204 {
    private final Production49_204 production = new Production49_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}