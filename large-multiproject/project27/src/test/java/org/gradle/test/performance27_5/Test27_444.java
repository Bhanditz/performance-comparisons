package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_444 {
    private final Production27_444 production = new Production27_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}