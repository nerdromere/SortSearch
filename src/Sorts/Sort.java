package Sorts;

import java.util.ArrayList;
/**
 * Sorts an array
 * @author larik AND RYAN
 */

/**
 * Linear sort
 * @author ryanr
 */
public class Sort {
    
    public static int linearSort(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
