package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_195 {
    private final Production53_195 production = new Production53_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}