package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_365 {
    private final Production64_365 production = new Production64_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}