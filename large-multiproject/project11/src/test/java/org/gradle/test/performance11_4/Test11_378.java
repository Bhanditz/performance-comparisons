package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_378 {
    private final Production11_378 production = new Production11_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}