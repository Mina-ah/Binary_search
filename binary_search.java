// Binary Search

public class Main
{
    public static int binary_search(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] arr={2,3,4,5,6,7,90};
	    int key=5;
	    int result=binary_search(arr,key);
		System.out.println(result);
	}
}
// time complexity is log base 2 n
