package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_235 {
    private final Production46_235 production = new Production46_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}