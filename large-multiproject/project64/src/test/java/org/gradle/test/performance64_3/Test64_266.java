package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_266 {
    private final Production64_266 production = new Production64_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}