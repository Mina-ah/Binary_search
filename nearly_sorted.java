/******************************************************************************
SEARCHING IN NEARLY SORTED ARRAY
which means the key element can be at different positions 
1 at mid 
2 at mid-1
3 at mid+1

*******************************************************************************/

public class Main
{
    public static int nearly_sorted(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid+1]==target) return mid+1;
            if(nums[mid-1]==target) return mid-1;
            else if(target<nums[mid]) end=mid-2;  
            else start=mid+2;
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] nums={5, 4, 3, 6, 9, 8, 7, 13, 10};
	    int target=5;
	    int val=nearly_sorted(nums,target);
	    if(val==-1)
		System.out.println("element not found");
		else System.out.println("element found at index "+val);
	}
}
