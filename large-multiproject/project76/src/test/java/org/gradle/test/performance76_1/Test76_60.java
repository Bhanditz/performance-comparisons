package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_60 {
    private final Production76_60 production = new Production76_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}