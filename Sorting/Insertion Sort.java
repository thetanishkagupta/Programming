// array is divided into 2 parts i.e sorted and unsorted . 
// Take one value from unsorted and place at appropriate place in sorted list .


import java.util.*;
class  Main{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
	    for(int i=1; i< arr.length; i++){
	        int current = arr[i];
	        int j = i-1;
	        while(j >= 0 && current < arr[j]){
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = current;
	    }
	    printArray(arr);
	}
}


// Output: 1 2 3 7 8 




