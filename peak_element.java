/******************************************************************************
BINARY SEARCH ON ANSWER :
it's a concept which tells that we can apply binary search on array which is not sorted
and that we need to find creiteria to check if key=mid or not and if not then where to move
left or right.

PEAK ELEMENT: it's the famous problem of binary search on answer it's main focus is to find the peak element 
from the array which is unsorted
to do so, focus on two parts first to find how to find the elemnt would be peak and secondly where to move
if it's not peak elemnt
peak element are the one who's left and right side element are less than it
and the start and beginning element is a peak element if its right and left side is less than it respectively
the second point needs to be focused is that if it's not he peak element than how to decide where to move
 so it depends upon if the left element is smaller then mid and righ element is greater than the mid 

*******************************************************************************/
class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid > 0 && mid < nums.length-1){
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]<nums[mid+1]) start=mid+1;
            else end=mid-1;
        }
        else if(mid==0)
            {
                if(nums.length==1) return 0;
               else if(nums[0]>nums[0+1]) return 0;
                else return 1;
            }
        else {
            if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
            else return nums.length-1;
        }
        }
        return start;
        }
        
    }
