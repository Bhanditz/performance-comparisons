package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_189 {
    private final Production73_189 production = new Production73_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}