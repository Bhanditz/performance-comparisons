package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_181 {
    private final Production36_181 production = new Production36_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}