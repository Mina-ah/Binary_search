/******************************************************************************
TO FIND A KEY IN INFINITE ARRAY:
to do so we have to consider few things first we know the value of start but we are unaware of the value of
end so we will make the next index after start as end for first iteration
we will check if the target is less than end if yes
then we will make start as end and end as end*2
while(target<nums[end]){
    start=end;
    end=end*2;
}
now with changed value of high we will continue the search as a normal binary search
*******************************************************************************/

public class Main {
    public static int infinite_search(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while(target>nums[end]){
               start=end;
               end=end*2;
            }
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
        return -1;
    }
}
