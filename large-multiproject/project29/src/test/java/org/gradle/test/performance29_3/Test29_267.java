package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_267 {
    private final Production29_267 production = new Production29_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}