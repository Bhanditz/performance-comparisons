package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_255 {
    private final Production39_255 production = new Production39_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}