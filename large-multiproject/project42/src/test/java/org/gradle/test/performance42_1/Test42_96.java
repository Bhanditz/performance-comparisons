package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_96 {
    private final Production42_96 production = new Production42_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}