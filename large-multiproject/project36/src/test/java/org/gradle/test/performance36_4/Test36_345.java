package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_345 {
    private final Production36_345 production = new Production36_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}