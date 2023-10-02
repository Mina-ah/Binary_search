// Order agnostic binary search {when the order of sorted array is not know either ascending or descending}

public class Main
{
    public static int binary_search(int[] arr,int key,int start,int end){
        boolean isdsc=arr[start]>arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(isdsc==true){
              if(key>arr[mid]){
                end=mid-1;
              }
              else{
                start=mid+1;
              }
            }
            else{
              if(key>arr[mid]){
                 start=mid+1;
              }
              else{
               end=mid-1;
              } 
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5,6,7};
	    int key=6;
	    int start=0;
        int end=arr.length-1;
	    int result=binary_search(arr,key,start,end);
		System.out.println(result);
	}
}
