package com.respam.algo;

import java.util.Scanner;

/**
 * Created by S P Mahapatra on 11/07/2018.
 */
public class MissingInArray {

    public int xorMethod(int[] array, int n){
        int x1=array[0], x2=1;
        for(int i=1; i<n-1; i++){
            x1 = x1 ^ array[i];
        }

        for(int i=2; i<=n; i++){
            x2 = x2 ^ i;
        }

        return x1 ^ x2;
    }

    public int sumMethod(int[] array, int n){
        int total = ((n+1) * n) / 2;
        for(int i=0; i<n-1; i++){
            total = total - array[i];
        }

        return total;
    }

    public static void main(String[] args) {
        MissingInArray ma = new MissingInArray();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] xorAnswers = new int[testCases];
        int[] sumMethodAnswers = new int[testCases];
        for(int i=0; i<testCases; i++){
            int n = sc.nextInt();
            int[] missingArray = new int[n-1];
            for(int j=0; j<n-1; j++){
                missingArray[j] = sc.nextInt();
            }
            xorAnswers[i] = ma.xorMethod(missingArray, n);
            sumMethodAnswers[i] = ma.sumMethod(missingArray, n);
        }

        for(int i=0; i<testCases; i++){
            System.out.println("Missing number found by XOR method for sequence " + (i+1) + " is: " + xorAnswers[i]);
            System.out.println("Missing number found by sum method for sequence " + (i+1) + " is: "
                    + sumMethodAnswers[i]);
            System.out.println();
        }
    }
}
