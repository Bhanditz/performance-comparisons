package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_306 {
    private final Production71_306 production = new Production71_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}