package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_77 {
    private final Production97_77 production = new Production97_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}