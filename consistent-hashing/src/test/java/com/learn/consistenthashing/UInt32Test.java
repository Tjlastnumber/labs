package com.learn.consistenthashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UInt32Test {

    @Test
    public void minValueTest() {
        UInt32 uint = new UInt32(0);
        assertEquals(uint.getValue(),0);
    }

    @Test
    public void maxValueTest() {
        UInt32 uint = new UInt32(Integer.MAX_VALUE);
        assertEquals(uint.getValue(), Integer.MAX_VALUE);
    }

    @Test
    public void int32MaxTest() {
        long maxValue = (1L << 32) - 1;
        UInt32 uint = new UInt32(maxValue);
        assertEquals(uint.getValue(), maxValue);
    }

    @Test
    public void overflowTest() {
        long maxValue = (1L << 32) - 1;
        UInt32 uint = new UInt32(maxValue + 1);
        assertEquals(uint.getValue(), 0);
    }

}
