package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_460 {
    private final Production40_460 production = new Production40_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}