package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_44 {
    private final Production91_44 production = new Production91_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}