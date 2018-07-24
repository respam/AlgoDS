package com.respam.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by S P Mahapatra on 24/07/2018.
 */
public class KadaneAlgorithmTest {

    private KadaneAlgorithm ka;

    @BeforeEach
    public void setUpKadane(){
        ka = new KadaneAlgorithm();
    }

    @Test
    public void testKadaneOne(){
        int[] array = {1,2,3};
        assertEquals(6, ka.processKadane(array));
    }

    @Test
    public void testKadaneTwo(){
        int[] array = {-1,-2,-3,-4};
        assertEquals(-1, ka.processKadane(array));
    }

    @Test
    public void testKadaneThree(){
        int[] array = {2,-1,2,3,4,-5};
        assertEquals(10, ka.processKadane(array));
    }

    @Test
    public void testKadaneFour(){
        int[] array = {-2,-3,4,-1,-2,1,5,-3};
        assertEquals(7, ka.processKadane(array));
    }

    @Test
    public void testKadaneFive(){
        int[] array = {-2,-3,4,-1,-2,1,5,-3,4};
        assertEquals(8, ka.processKadane(array));
    }

    @Test
    public void testKadaneSix(){
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, ka.processKadane(array));
    }
}
