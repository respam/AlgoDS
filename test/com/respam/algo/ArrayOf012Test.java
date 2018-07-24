package com.respam.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOf012Test {

    private ArrayOf012 ao12;

    @BeforeEach
    void setUp() { ao12 = new  ArrayOf012(); }

    @Test
    public void testOne(){
        int[] array = {1,0,0,1,2};
        int s = 5;
        String actual = Arrays.toString(ao12.sort012(array, s));
        String expected = "[0, 0, 1, 1, 2]";

        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        int[] array = {0, 2, 1, 2, 0};
        int s = 5;
        String actual = Arrays.toString(ao12.sort012(array, s));
        String expected = "[0, 0, 1, 2, 2]";

        assertEquals(expected, actual);
    }

    @Test
    public void testThree(){
        int[] array = {0, 1, 0};
        int s = 3;
        String actual = Arrays.toString(ao12.sort012(array, s));
        String expected = "[0, 0, 1]";

        assertEquals(expected, actual);
    }
}
