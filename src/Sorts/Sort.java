package Sorts;

import java.util.ArrayList;
/**
 *
 * @author larik
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
