package com.respam.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by S P Mahapatra on 24/07/2018.
 */
public class SubArrayWithGivenSumTest {

    private SubArrayWithGivenSum saws;

    @BeforeEach
    public void setUp(){
        saws = new SubArrayWithGivenSum();
    }

    @Test
    public void testOne(){
        int[] array = {1,2,3,7,5};
        int n = 5;
        int sum = 12;
        String actual = Arrays.toString(saws.subArraySum(array,n,sum));
        String expected = "[2, 4]";

        assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int sum = 15;
        String actual = Arrays.toString(saws.subArraySum(array,n,sum));
        String expected = "[1, 5]";

        assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        int[] array = {1,4,20,3,10,5};
        int n = 6;
        int sum = 33;
        String actual = Arrays.toString(saws.subArraySum(array,n,sum));
        String expected = "[3, 5]";

        assertEquals(expected,actual);
    }

    @Test
    public void testFour(){
        int[] array = {1,4,0,0,3,10,5};
        int n = 7;
        int sum = 7;
        String actual = Arrays.toString(saws.subArraySum(array,n,sum));
        String expected = "[2, 5]";

        assertEquals(expected,actual);
    }
}
