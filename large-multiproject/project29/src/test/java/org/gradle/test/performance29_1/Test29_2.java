package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_2 {
    private final Production29_2 production = new Production29_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}