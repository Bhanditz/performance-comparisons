package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_43 {
    private final Production52_43 production = new Production52_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}