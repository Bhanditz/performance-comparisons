package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_373 {
    private final Production71_373 production = new Production71_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}