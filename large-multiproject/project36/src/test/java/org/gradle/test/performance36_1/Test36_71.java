package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_71 {
    private final Production36_71 production = new Production36_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}