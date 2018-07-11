package com.respam.algo;

import java.util.Scanner;

/**
 * Created by S P Mahapatra on 11/07/2018.
 */
public class SubArrayWithGivenSum {

    public int[] subArraySum(int[] array, int n, int s){
        int[] answer = {-1, -1};
        for(int i=0; i<n; i++){
            int sum = array[i];
            while (sum <= s){
                for(int j=i+1; j<n; j++){
                    sum = sum + array[j];
                    if(sum == s) {
                        answer[0] = i + 1;
                        answer[1] = j + 1;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SubArrayWithGivenSum sgs = new SubArrayWithGivenSum();
        Scanner sc = new Scanner(System.in);
        int size=0, s=0;
        int testCases = sc.nextInt();
        int[][] answers = new int[testCases][2];

        for(int i=0; i<testCases; i++){
            size = sc.nextInt();
            s = sc.nextInt();
            int[] queryArray = new int[size];
            for(int j=0; j<size; j++){
                queryArray[j] = sc.nextInt();
            }
            int[] result = sgs.subArraySum(queryArray, size, s);
            answers[i][0] = result[0];
            answers[i][1] = result[1];
        }

        for(int i=0; i<testCases; i++){
            System.out.println("The result sub-array for sequence no " + (i+1) + " is:");
            System.out.println(answers[i][0] + "  " + answers[i][1]);
            System.out.println();
        }
    }
}
