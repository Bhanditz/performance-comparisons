package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_422 {
    private final Production19_422 production = new Production19_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}