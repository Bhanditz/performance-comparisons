package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_481 {
    private final Production17_481 production = new Production17_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}