package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_469 {
    private final Production19_469 production = new Production19_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}