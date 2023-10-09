/******************************************************************************
ALLOCATE MINIMUM NUMBER OF PAGES :
in this problem we are saying that we are given few books in an array as [10,20,30,50] here the elements represent
the number of pages in that book and we are also given the number of students as k=2 ,there are few conditons
that we have to fulfill such as #first one is that no student should be ideal they atleast must have one book
alloted to read #second is that they cant read a book together and #third we have to alot all the books
in continuos manner like we cant alot book 20 and 50 to one and 10 and 30 to another
our goal is to provide the books in a manner that there shouldn't me much load on a student
suppose if [10,20,30,50] we alloted 10 to s1 and others to s2 10/90 , 10 and 20 to s1 and others to s2 30/80
10 20 30 to s1 and 50 to s2 60/50 so we have to take the maximum no of pages each student is reading after allocationg
in this manner 90, 80 ,60 so we will take the minimum of these 3 which is 60 as the answer
in short we have to allocate in a manner which causes less stress on one student
steps :
1-take a range where maximum number of page allocaion may lie for each student starting from max in array till sum of array
2-we will take the mx from the above range 
3-isvalid function to check if the sum is greater than max or not;
*******************************************************************************/
import java.util.Arrays; 
public class Main
{
    public static boolean isValid(int[] arr,int mid,int n,int k){
       int student=0;
       int sum=arr[0];
       for(int i=1;i<arr.length;i++){
           sum=sum+arr[i];
           if(sum>mid){
               student++;
               sum=arr[i];
           }
           if(student>=k) return false;
       }
       return true;
    }
	public static void main(String[] args) {
		int[] arr={10,20,30,40};
		int n=arr.length;
		int k=2;
		int res=-1;
		int start=Arrays.stream(arr).max().getAsInt();
        int end=0;
        if(k>n) {
            System.out.println("number of students are greater than number of books");
            return;
        }
        for(int i=0;i<arr.length;i++)end=end+arr[i];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(arr,mid,n,k)==true){
                res=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        System.out.println(res);
	
	}
}
