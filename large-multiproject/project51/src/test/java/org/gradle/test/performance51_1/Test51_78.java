package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_78 {
    private final Production51_78 production = new Production51_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}