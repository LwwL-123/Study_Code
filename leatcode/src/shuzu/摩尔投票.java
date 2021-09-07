package shuzu;

import org.jetbrains.annotations.NotNull;

class Solution {
    public int majorityElement(int @NotNull [] nums) {
        int major = nums[0];
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==major)
                count++;
            else
                count--;
            if(count==0){
                major = nums[i];
                count++;
            }
        }

        count = 0;
        int n = nums.length/2+1;
        for(int num:nums){
            if(num==major)
                count++;
        }
        if(count>n)
            return major;
        else
            return -1;
    }
}