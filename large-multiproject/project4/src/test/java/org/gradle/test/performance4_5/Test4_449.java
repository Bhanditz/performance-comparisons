package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_449 {
    private final Production4_449 production = new Production4_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}