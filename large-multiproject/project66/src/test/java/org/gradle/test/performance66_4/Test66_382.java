package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_382 {
    private final Production66_382 production = new Production66_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}