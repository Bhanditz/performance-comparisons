package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_54 {
    private final Production64_54 production = new Production64_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}