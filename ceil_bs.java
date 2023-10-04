/******************************************************************************
TO FIND THE CEIL OF AN ELEMENT
ceil of a number is smallest element which is greater than a number
*******************************************************************************/

public class Main
{
    public static int ceil_bs(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int res=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return nums[mid];
            if(nums[mid]<target){
                start=mid+1;
            }
            else {
                res=nums[mid];
                end=mid-1;
            }
        }
        return res;
    }
	public static void main(String[] args) {
	    int[] nums={1,3,4,6,7,8,9,30};
	    int target=3;
	    int val=ceil_bs(nums,target);
	    
	    System.out.println("the floor of the value is:  "+val);
	    
	}
}
