package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_361 {
    private final Production64_361 production = new Production64_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}