package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_464 {
    private final Production42_464 production = new Production42_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}