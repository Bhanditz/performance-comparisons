package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_112 {
    private final Production97_112 production = new Production97_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}