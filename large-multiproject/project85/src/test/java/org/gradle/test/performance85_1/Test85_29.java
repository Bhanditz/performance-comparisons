package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_29 {
    private final Production85_29 production = new Production85_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}