package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_234 {
    private final Production35_234 production = new Production35_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}