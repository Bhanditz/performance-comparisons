package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_65 {
    private final Production78_65 production = new Production78_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}