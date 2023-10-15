package com.anirbanmu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void testOne() {
        Assertions.assertEquals(1, 2 - 1);
    }

    @Test
    public void testTwo() {
        Assertions.assertEquals(1, 3 - 2);
    }
}
