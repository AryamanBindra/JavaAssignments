package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class insertionSort {
	
//	static void sort(int arr[])
//    {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1; // previous index to cmp.
//  
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
	
	public static void main(String[] args) {
		int arr[] = {14,78,1,2,0,67};
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i:arr) {
			newArray.add(Integer.valueOf(i));
		}
		newArray.sort(null);;
		System.out.println(newArray);
	}
}
