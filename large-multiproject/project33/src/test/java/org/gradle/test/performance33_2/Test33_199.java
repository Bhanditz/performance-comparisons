package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_199 {
    private final Production33_199 production = new Production33_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}