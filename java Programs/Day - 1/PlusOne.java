/*
Plus One Problem : You are given a large integer represented as an 
integer array digits, where each digits[i] is the ith digit of the 
integer. The digits are ordered from most significant to 
least significant in left-to-right order. The large integer 
does not contain any leading 0's.
Increment the large integer by one and return the 
resulting array of digits.

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/
import java.util.*;

public class PlusOne
{
    public static int[] plusOne(int[] digits) 
    {
        int n=digits.length;

        for(int i=n-1; i>=0; i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int [] new_number = new int [n+1];
        new_number[0]=1;
        return new_number;
    }

    public static void main(String[] args)
    {
        System.out.println("Initiating...");

        int nums[] = {1,2,3};
        
        int arr[] = plusOne(nums);

        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();

        System.out.println("Terminating...");
    }
}