package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_386 {
    private final Production36_386 production = new Production36_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}