package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_53 {
    private final Production34_53 production = new Production34_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}