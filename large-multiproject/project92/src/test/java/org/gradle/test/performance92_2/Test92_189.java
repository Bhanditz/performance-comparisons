package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_189 {
    private final Production92_189 production = new Production92_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}