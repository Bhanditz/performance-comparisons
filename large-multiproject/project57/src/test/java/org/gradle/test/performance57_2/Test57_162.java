package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_162 {
    private final Production57_162 production = new Production57_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}