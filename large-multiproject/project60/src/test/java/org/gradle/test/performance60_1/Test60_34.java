package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_34 {
    private final Production60_34 production = new Production60_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}