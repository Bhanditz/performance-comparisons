package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_457 {
    private final Production42_457 production = new Production42_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}