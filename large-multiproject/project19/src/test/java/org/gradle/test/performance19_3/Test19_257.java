package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_257 {
    private final Production19_257 production = new Production19_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}