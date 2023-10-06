/******************************************************************************
FIND THE MINIMUM DIFFERENCE OF THE ELEMENT OF ARRAY WITH THE KEY
to do so first we will do the normal binary search 
if key is found in the array it will return the key itself
else it will find the difference from nums[high] with target and nums[low]with taget and return the min 
of both of them;
*******************************************************************************/
import static java.lang.Math.*;
public class Main {
    public static int minimum_bs(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
               return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int leftn=abs(nums[end]-target);
        int rightn=abs(nums[start]-target);
        int mini=Math.min(leftn,rightn);
        if(mini==leftn){
            return end;
        }
        else{
            return start;
        }
    }
     public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8, 9};
        int target = 5;
        int ans= minimum_bs(nums,target);
        System.out.println(ans);
}
}
