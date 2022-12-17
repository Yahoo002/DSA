package com.yahoooo.search.linear;

import java.util.Arrays;

public class SearchString
{
    public static void main(String[] args)
    {
            String name = "Yahoo";
            char target = 'h';
            Integer num = 10;
            System.out.println(stringSearch(name, target));
            System.out.println(Arrays.toString(name.toCharArray()));
    }

    //using for each loop
    static boolean stringSearch2(String name, char target)
    {

        if(name.length() == 0)
            return false;

        for(char ch: name.toCharArray())
        {
            if(ch == target)
                return true;
        }
        return false;
    }

    static boolean stringSearch(String name, char target)
    {

        if(name.length() == 0)
            return false;

        for (int i = 0; i < name.length(); i++)
        {
            if(target == name.charAt(i))
                return true;
        }
        return false;
    }

}
