package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_320 {
    private final Production33_320 production = new Production33_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}