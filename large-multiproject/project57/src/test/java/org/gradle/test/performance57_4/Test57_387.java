package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_387 {
    private final Production57_387 production = new Production57_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}