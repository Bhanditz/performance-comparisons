package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_195 {
    private final Production33_195 production = new Production33_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}