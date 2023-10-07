/******************************************************************************
SEARCH IN ROW WISE AND COLUMN WISE SORTED ARRAY :
few things to keep in mind first we are starting the pointer from row of 0 and column of length-1
after that it will check the if the element is greater or smaller if greater then move to below side
if smaller then move to left side
set the base condition for m*n matrix as while(row>=0 && row<m && column >=0 && column<n )

*******************************************************************************/
import java.util.Arrays;
public class Main {
    public static int[] matrix_bsearch(int[][] nums, int target) {
        int m=nums.length;
        int n=nums[0].length;
        int row=0;
        int column=n-1;
        while (row >= 0 && row < m && column >= 0 && column < n) {
            if (nums[row][column] == target) {
               return new int[]{row,column};
            } else if (nums[row][column] > target) {
                 column--;
            } else {
                row++;
            }
        }
            return new int[]{-1,-1};
        }
     public static void main(String[] args) {
        int[][] nums ={{1, 3, 6, 8},
                         {2, 4, 7, 9},
                         {5, 10, 11, 12},
                         {13, 14, 15, 16}};
        int target = 25;
        int[] ans= matrix_bsearch(nums,target);
        System.out.println(Arrays.toString(ans));
}
}
