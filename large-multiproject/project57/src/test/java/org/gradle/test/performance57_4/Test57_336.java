package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_336 {
    private final Production57_336 production = new Production57_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}