package com.yahoooo.arrays;

import java.util.Arrays;

public class basicArray
{
    public static void main(String[] args)
    {
        int[] arr; //declaration of array. arr is getting defined in the stack. Happens at compile time

        arr = new int[5]; //initialisation. object is being created in the memory (heap). Happens at run time

        //array objects are in heap.
        //heap objects are not continuous.
        //therefore arrays may not be continuous in Java as jvm randomly allocated memory in heap.

        //new is used to create an object (dynamic memory allocation) at run time.

        //Primitive datatypes: int, char, boolean, float, double, long

        //non-primitive datatypes:
        System.out.println(args); //garbage value
        System.out.println(Arrays.toString(args)); //[] empty

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i : array) System.out.print(i + " ");

        System.out.println();

        //for each loop
        for(int num = 0; num<array.length; num++)
         {
             System.out.print(array[num] + " ");
         }

        System.out.println();

        System.out.println(Arrays.toString(array));

        //2D Array

        // - mentioning no of rows is compulsory. Mentioning no of rows is not compulsory

        // - Array of arrays

        int[][] arr2D = {
                {1,2,3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println(arr2D.length);
        for(int row = 0; row < arr2D.length; row++)
        {
            for(int col = 0; col < arr2D[row].length; col++)
            {
                System.out.print(arr2D[row][col]+ " ");
            }
            System.out.println();
        }

        //OR

        for(int row = 0; row< arr2D.length; row++)
        {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        //OR

        for(int[] a : arr2D)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
