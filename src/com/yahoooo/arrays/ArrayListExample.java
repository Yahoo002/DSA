package com.yahoooo.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        //<> should contain non-primitive datatypes only to define the type of array list
        // list is the object name
        //Arraylist<> is a class
        // ArrayList<>() is a constructor
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(43);
        list.add(10);
        list.add(143);
        list.add(54);
        list.add(21);
        list.add(22);
        System.out.println(list.contains(32));
        list.set(3, 43);
        list.remove(3);
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>(10);
        System.out.println("Input elements for list2 example: ");
        for(int i = 0; i< 5; i++)
        {
            list2.add(sc.nextInt());
        }

        for(int i =0; i<5; i++)
        {
            System.out.print(list2.get(i)+ " "); //list[index] will not work
        }

        //System.out.println(list2); gives same print statement as above
    }
}
