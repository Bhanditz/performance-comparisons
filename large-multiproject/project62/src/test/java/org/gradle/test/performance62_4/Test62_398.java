package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_398 {
    private final Production62_398 production = new Production62_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}