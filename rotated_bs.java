/******************************************************************************
 we are saying if an rotated sorted array is given lets say {11,12,15,18,2,5,8,6}
 we are first finding the mid which is 18 then we are checking if the mid >end 
 if yes change start=mid+1
 start =2
 now check again if mid=5>end
 if no make end=mid
 now check again if mid 2>5 
 end=mid
 now only one element left so return start;
*******************************************************************************/

public class Main
{
     public static int findMinimum(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start<end){
        int mid=start+(end-start)/2;
        if(nums[mid]>nums[end])
        start=mid+1;
        else
        end=mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {11,12,15,18,2,5,8,6};
        int minimum = findMinimum(nums);
        System.out.println("The minimum element in the rotated sorted array is: " + minimum);
    }
}
