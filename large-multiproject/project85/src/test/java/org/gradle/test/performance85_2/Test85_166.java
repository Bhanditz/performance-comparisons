package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_166 {
    private final Production85_166 production = new Production85_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}