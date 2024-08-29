package org.example;

import dataStructures.Exercise;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        int[] nums = {2, 7, 11, 15};
        int target = 26;

        // Get the result
        int[] result = exercise.twoSum(nums, target);

        // Print the result array
        System.out.println(Arrays.toString(result));
    }
}