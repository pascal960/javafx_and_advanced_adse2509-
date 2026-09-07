package com.adse.sess01_java_util_apis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java program to demonstrate an Unmodifiable implementation of the List interface.
 *
 * @author pascal
 */
public class UnmodifiableListDemo
{
    public static void main(String[] args)
    {
        // Create a mutable list of fruits
        List<String> mutableList = new ArrayList<>();

        mutableList.add("Avocado");
        mutableList.add("Durian");
        mutableList.add("cherry");
        mutableList.add("Apple");

        // Create an unmodifiable view of the fruit list
        List<String> unmodifiableList =
                Collections.unmodifiableList(mutableList);

        // Try modifying the elements from the unmodifiable list
        try
        {
            unmodifiableList.add("Banana"); // Will throw an exception
        }
        catch (UnsupportedOperationException uoe)
        {
            System.err.println(
                    "Modification attempt failed due to: \n"
                    + uoe.getLocalizedMessage());
        }
    }
}