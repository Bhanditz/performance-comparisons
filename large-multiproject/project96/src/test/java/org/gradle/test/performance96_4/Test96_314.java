package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_314 {
    private final Production96_314 production = new Production96_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}