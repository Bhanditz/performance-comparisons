package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_354 {
    private final Production42_354 production = new Production42_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}