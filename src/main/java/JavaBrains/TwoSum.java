package JavaBrains;

/*
Given an array of integers, return indices of the two nubers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

	Given nums = [2, 7, 11, 15], target = 9.

	Because nums[0] + nums[1] = 2 + 7 = 9.

	return [0, 1].
 */

import java.util.ArrayList;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{3,15,2,7};
        int requiredSum = 9;

        int[] solution = twoSum(nums, requiredSum);
        System.out.println(solution[0] + ", "+ solution[1]);

    }

    public static int[] twoSum(int[] nums, int requiredSum){

        ArrayList<Integer> numbersSmallerThanSum = new ArrayList<Integer>();
        for (int num : nums) {
            if (num < requiredSum) {
                numbersSmallerThanSum.add(num);
            }
        }
        for(int i =0; i< numbersSmallerThanSum.size(); i++){
            for (int j = i + 1; j < numbersSmallerThanSum.size(); j++){
                if (numbersSmallerThanSum.get(i) + numbersSmallerThanSum.get(j) == requiredSum){
                    return new int[]{numbersSmallerThanSum.get(i), numbersSmallerThanSum.get(j)};
                }
            }
        }

        return null;
    }
}
