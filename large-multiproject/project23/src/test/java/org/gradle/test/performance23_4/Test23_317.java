package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_317 {
    private final Production23_317 production = new Production23_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}