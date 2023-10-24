// array is divided into two subarrays i.e sorted and unsorted , 
// initially we assume that sorted subarray is empty i.e no element. 
// From unsorted list find the minimum element and swap it with the starting element of unsorted list.
//                                                                  ---------------------------------


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
        
	    for(int i=0; i< (arr.length - 1); i++){
	        int smallest = i;
	        for(int j = i+1 ; j<arr.length; j++){
	            if (arr[smallest] > arr[j]){
	                smallest = j;
	            }
	        }
	       int temp = arr[smallest];
	       arr[smallest] = arr[i];
	       arr[i] = temp;
	    }
	    printArray(arr);
	}
}


//Output: 1 2 3 7 8 

