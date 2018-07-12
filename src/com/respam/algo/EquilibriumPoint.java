package com.respam.algo;

import java.util.Scanner;

//Todo Fix this algorithm
public class EquilibriumPoint {

    public int equilibrium(int[] array, int size){
        int equibPoint = -1;
        int sumLeft = 0;
        int sumRight = 0;
        for(int i=0; i<size; i++){
            sumLeft += array[i];
            sumRight += array[size-(i+1)];
            if(sumLeft == sumRight && size == 1){
                return i+1;
            }

            if(sumLeft == sumRight && size > 1){
                return i+2;
            }
        }

        return equibPoint;
    }

    public static void main(String[] args) {
        EquilibriumPoint ep = new EquilibriumPoint();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] answers = new int[testCases];

        for(int i=0; i<testCases; i++){
            int size = sc.nextInt();
            int[] queryArray = new int[size];
            for(int j=0; j<size; j++){
                queryArray[j] = sc.nextInt();
            }
            answers[i] = ep.equilibrium(queryArray, size);
        }

        for(int i=0; i<testCases; i++){
            System.out.println("The equilibrium point for array no. " + (i+1)
                    + " is " + answers[i]);
        }
    }
}
