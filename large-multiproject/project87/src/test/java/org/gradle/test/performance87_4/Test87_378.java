package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_378 {
    private final Production87_378 production = new Production87_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}