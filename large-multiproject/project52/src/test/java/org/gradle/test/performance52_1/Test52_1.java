package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_1 {
    private final Production52_1 production = new Production52_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}