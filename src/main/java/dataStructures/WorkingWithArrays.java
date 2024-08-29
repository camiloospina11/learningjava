package dataStructures;

import java.util.Arrays;

public class WorkingWithArrays
{
    public static void main(String[] args)
    {
        int [] nums = new int[5];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 1;
        nums[3] = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);
        nums[4] = 5;
        System.out.println(Arrays.toString(nums));

        // another one way for creating an array
        String[] colors = {"Yellow", "Blue", "Pink"};

        for (int i = 0; i<colors.length; i++){
            System.out.println(colors[i]);
        }

        for (int i = nums.length-1; i>=0; i--){
            System.out.println(nums[i]);
        }

        for (String color : colors
             )
        {
            System.out.println(color);
        }

        Arrays.stream(nums).forEach(System.out::println);

    }
}
