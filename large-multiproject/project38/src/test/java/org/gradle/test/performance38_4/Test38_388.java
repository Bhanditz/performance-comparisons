package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_388 {
    private final Production38_388 production = new Production38_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}