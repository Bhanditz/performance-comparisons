package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_469 {
    private final Production57_469 production = new Production57_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}