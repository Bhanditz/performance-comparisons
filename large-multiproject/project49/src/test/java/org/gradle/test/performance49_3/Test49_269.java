package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_269 {
    private final Production49_269 production = new Production49_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}