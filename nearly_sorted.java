/******************************************************************************
TO FIND THE FLOOR OF AN ELEMENT
if the given value to search is 5 and the array contains values such as 1,2,3,4,5,6,7 then the floor would
be 4...
we will store the value of mid in res 

*******************************************************************************/

public class Main
{
    public static int nearly_sorted(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(mid+1<=end && nums[mid+1]==target) return mid+1;
            if(mid-1>=start && nums[mid-1]==target) return mid-1;
            else if(target<nums[mid]) end=mid-2;  
            else start=mid+2;
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] nums={5, 4, 3, 6, 9, 8, 7, 13, 10};
	    int target=10;
	    int val=nearly_sorted(nums,target);
	    if(val==-1)
		System.out.println("element not found");
		else System.out.println("element found at index "+val);
	}
}
