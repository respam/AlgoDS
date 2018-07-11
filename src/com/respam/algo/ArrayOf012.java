package com.respam.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by S P Mahapatra on 11/07/2018.
 */
public class ArrayOf012 {

    public int[] sort012(int[] array, int size){
        int[] answer = new int[size];
        int count1=0, count2=0;
        for(int i=0; i<size; i++){
            if(array[i] == 1)
                count1 = count1 + 1;

            if(array[i] == 2)
                count2 = count2 + 1;
        }
        int count0 = size - (count1 + count2);
        for(int i=0; i<count0; i++){
            answer[i] = 0;
        }
        for(int i=count0; i<(count0+count1); i++){
            answer[i] = 1;
        }
        for(int i=(count0+count1); i<size; i++){
            answer[i] = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        ArrayOf012 a012 = new ArrayOf012();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i=0; i<testCases; i++){
            int size = sc.nextInt();
            int[] queryArray = new int[size];
            for(int j=0; j<size; j++){
                queryArray[j] = sc.nextInt();
            }
            hm.put(i, "The sorted result for array no. " + (i+1) +
                    " " + Arrays.toString(a012.sort012(queryArray, size)));
        }

        hm.forEach((key,value) -> System.out.println(value));
    }
}
