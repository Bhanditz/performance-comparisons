package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_140 {
    private final Production29_140 production = new Production29_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}