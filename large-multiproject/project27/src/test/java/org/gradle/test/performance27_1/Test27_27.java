package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_27 {
    private final Production27_27 production = new Production27_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}