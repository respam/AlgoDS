package com.respam.algo;

import java.util.Scanner;

/**
 * Created by S P Mahapatra on 9/07/2018.
 */
public class KadaneAlgorithm {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] answers = new int[testCases];

        for(int i=0; i<testCases; i++){
            int length = sc.nextInt();
            int array[] = new int[length];
            for(int j=0; j<length; j++){
                array[j] = sc.nextInt();
            }
            answers[i] = processKadane(array);
        }

        for(int i=0; i<testCases; i++){
            System.out.println("Max Subset Sum for Array No. " + (i+1) + " is: " + answers[i]);
            System.out.println();
        }
    }

    private static int processKadane(int[] arrayToProcess) {
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<arrayToProcess.length; i++){
            int sum = arrayToProcess[i];
            for(int j=i+1; j<arrayToProcess.length; j++){
                sum = sum + arrayToProcess[j];
                System.out.println("sum "+ sum);

                if(answer < sum){
                    answer = sum;
                    System.out.println("answer " + answer);
                }
            }
        }

        return answer;
    }
}
