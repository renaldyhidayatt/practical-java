package com.sanedge.java.BitManipulation.singlenumber;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }

        return result;
    }
}
