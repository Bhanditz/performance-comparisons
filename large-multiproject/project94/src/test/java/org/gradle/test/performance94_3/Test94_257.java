package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_257 {
    private final Production94_257 production = new Production94_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}