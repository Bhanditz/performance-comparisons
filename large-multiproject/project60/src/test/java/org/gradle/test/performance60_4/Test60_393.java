package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_393 {
    private final Production60_393 production = new Production60_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}