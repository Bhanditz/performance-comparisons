package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_322 {
    private final Production11_322 production = new Production11_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}