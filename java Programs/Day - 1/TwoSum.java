/*
Two Sum Problem : Given an array of integers nums and an 
integer target, return indices of the two numbers 
such that they add up to target.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.*;

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> seenValues = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int difference = target - nums[i];
            
            if(seenValues.containsKey(difference))
            {
                // creating a new array for storing result
                return new int[] {seenValues.get(difference), i};
            }else
            {
                seenValues.put(nums[i], i);
            }
        }
        
        return new int[] {-1, -1};
    }
    public static void main(String[] args)
    {
        System.out.println("Initiating...");

        int nums[] = {2,7,11,15};
        int target = 9;

        int arr[] = twoSum(nums,target);

        System.out.println("["+arr[0]+","+arr[1]+"]");

        System.out.println("Terminating...");
    }
}