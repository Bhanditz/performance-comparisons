package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_88 {
    private final Production53_88 production = new Production53_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}