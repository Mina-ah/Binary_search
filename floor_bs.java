/******************************************************************************
TO FIND THE FLOOR OF AN ELEMENT
Floor of a value means the greatest value which is less than value
1:if the given value to search is 5 and the array contains values such as 1,2,3,4,6,7 then the floor would
be 4...
2:suppose if the key is present then we are gonna return the key like in normal case
for first case scenario:
1,2,3,4,6,7 we will calculate the mid if nums[mid]>target then end=mid-1;
else start=mid+1;
  
and return the mid by the function 
*******************************************************************************/

public class Main
{
    public static int floor_bs(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int res=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                res=nums[mid];
                start=mid+1;
            }
            else end=mid-1;
        }
        return res;
    }
	public static void main(String[] args) {
	    int[] nums={1,2,3,4,6,7,8,9,30};
	    int target=3;
	    int val=floor_bs(nums,target);
	    if(val!=target)
	    System.out.println("the floor of the value is:  "+val);
	    else System.out.println("the element is found at index :  "+val);
	}
}
