package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_88 {
    private final Production51_88 production = new Production51_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}