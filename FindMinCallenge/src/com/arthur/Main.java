package com.arthur;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count){

        int[] myArray = new int[count];

        for (int i = 0 ; i < count ; i++){
            System.out.println("Enter #"+ (i+1) +" number:");
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        System.out.println("Enter ammount of numbers ( > 0):");
        int count = scanner.nextInt();

        int[] myArray = readIntegers(count);
        System.out.println(Arrays.toString(myArray));

        System.out.println("min = "+findMin(myArray));



        scanner.close();
    }
}
