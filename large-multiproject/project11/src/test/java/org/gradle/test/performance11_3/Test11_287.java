package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_287 {
    private final Production11_287 production = new Production11_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}