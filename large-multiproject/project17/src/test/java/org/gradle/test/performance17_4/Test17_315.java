package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_315 {
    private final Production17_315 production = new Production17_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}