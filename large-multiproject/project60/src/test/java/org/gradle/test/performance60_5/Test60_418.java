package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_418 {
    private final Production60_418 production = new Production60_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}