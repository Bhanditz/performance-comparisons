package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_427 {
    private final Production93_427 production = new Production93_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}