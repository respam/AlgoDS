package com.respam.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by S P Mahapatra on 24/07/2018.
 */
public class MissingInArrayTest {

    private MissingInArray mia;

    @BeforeEach
    public void setUp(){
        this.mia = new MissingInArray();
    }

    @Test
    public void testXORmethodOne(){
        int[] arrayXOR = {1,2,3,5};
        int n = 5;
        int expected = 4;
        int actual;

        actual = this.mia.xorMethod(arrayXOR, n);

        assertEquals(expected, actual);
    }

    @Test
    public void testXORmethodTwo(){
        int[] arrayXOR = {1,2,3,4,5,6,7,8,10};
        int n = 10;
        int expected = 9;
        int actual;

        actual = this.mia.xorMethod(arrayXOR, n);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumMethodOne(){
        int[] arrayXOR = {1,2,3,5};
        int n = 5;
        int expected = 4;
        int actual;

        actual = this.mia.sumMethod(arrayXOR, n);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumMethodTwo(){
        int[] arrayXOR = {1,2,3,4,5,6,7,8,10};
        int n = 10;
        int expected = 9;
        int actual;

        actual = this.mia.sumMethod(arrayXOR, n);

        assertEquals(expected, actual);
    }
}
