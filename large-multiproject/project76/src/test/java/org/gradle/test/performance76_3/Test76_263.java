package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_263 {
    private final Production76_263 production = new Production76_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}