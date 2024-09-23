package JavaProgramming;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSumExercise
{
    public static void main(String[] args)
    {
        int nums[] = new int []{3, 3, 5 ,6, 3, 2};
        int target = 8;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];

                if(map.containsKey(diff)) {
                    return new int[] {map.get(diff), i};
                }

                map.put(nums[i], i);
            }

            return new int[] {};
        }

    public static int threeBrothers(int a, int b){
        HashSet<Integer> allBrothers = new HashSet<>();
        allBrothers.add(1);
        allBrothers.add(2);
        allBrothers.add(3);

        allBrothers.remove(a);
        allBrothers.remove(b);
        return allBrothers.iterator().next();
    }
}

