package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_305 {
    private final Production49_305 production = new Production49_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}