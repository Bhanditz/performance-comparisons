package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_324 {
    private final Production78_324 production = new Production78_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}