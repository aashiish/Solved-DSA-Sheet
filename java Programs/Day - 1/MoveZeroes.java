/*
Move Zeroes : Given an integer array nums, move all 0's to the 
end of it while maintaining the relative order of the 
non-zero elements.
Note that you must do this in-place without making a copy of the array.

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
import java.util.*;

public class MoveZeroes
{
    public static void moveZeroes(int[] nums) 
    {
        int left = 0;
        for (int right = 0; right < nums.length; right ++) {
            
            if (nums[right] == 0) continue;
            
            nums[left] = nums[right];
            left ++;
        }
        
        while (left < nums.length) {
            nums[left] = 0;
            left ++;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Initiating...");

        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        for(int val:nums)
        {
            System.out.print(val+" ");
        }
        System.out.println();

        System.out.println("Terminating...");
    }
}