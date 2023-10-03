/******************************************************************************
#find the smallest
#find if the left part of smallest and right part of smallest is sorted of not
if left part is sorted than check if nums[start]<=target && target<nums[mid] if true end=mid-1 else start=mid+1
if right part is sorted than check if nums[mid]<target && target<=nums[end]if true start=mid+1 else end=mid-1 


*******************************************************************************/

public class Main
{
    public static int rotated_Search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid]) end=mid-1;
                else start=mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[end]) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] nums={6,7,8,9,2,3,4,5};
	    int target=6;
	    int val=rotated_Search(nums,target);
	    if(val==-1)
		System.out.println("element not found");
		else System.out.println("element found at index "+val);
	}
}
