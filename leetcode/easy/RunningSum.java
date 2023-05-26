package leetcode.easy;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};

        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i <= nums.length-1; i++) {
            nums[i] = nums[i-1] +nums[i];
        }
        return nums;
    }
}
