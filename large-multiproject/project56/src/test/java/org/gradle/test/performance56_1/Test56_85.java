package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_85 {
    private final Production56_85 production = new Production56_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}