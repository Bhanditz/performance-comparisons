package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_60 {
    private final Production23_60 production = new Production23_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}