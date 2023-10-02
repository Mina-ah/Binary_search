//Binary search where if we have a index we will find the first occurence and last occurence

public class Main
{
    public static int last_occurence(int[] arr,int key,int start,int end){
        boolean isdsc=arr[start]>arr[end];
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                res=mid;
                start=mid+1;
            }
            else if(key>arr[mid]){
                 start=mid+1;
            }
            else{
               end=mid-1;
            }
        }
        return res;
    }
    public static int first_occurence(int[] arr,int key,int start,int end){
        boolean isdsc=arr[start]>arr[end];
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                res=mid;
                end=mid-1;
            }
            else if(key>arr[mid]){
                 start=mid+1;
            }
            else{
               end=mid-1;
            }
        }
        return res;
    }
	public static void main(String[] args) {
	    int[] arr={1,10,10,10,10,60,70};
	    int key=10;
	    int start=0;
      int end=arr.length-1;
	    int first=first_occurence(arr,key,start,end);
	    int last=last_occurence(arr,key,start,end);
	  	System.out.println("First occurence is "+first+" last occurence is "+last);
	}
}
