package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_209 {
    private final Production72_209 production = new Production72_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}