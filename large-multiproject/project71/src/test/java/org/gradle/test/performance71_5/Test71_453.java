package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_453 {
    private final Production71_453 production = new Production71_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}