package prac;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		// 14,78,1,2,0,67 -> ascending order
		long startTime = System.currentTimeMillis();
		
		int arr[] = {14,78,1,2,0,67};
		System.out.println(Arrays.toString(arr));
		
		for(int j=0; j<arr.length-1;j++) {
			for(int i=0; i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
		}
		System.out.println(Arrays.toString(arr));
	}
		long endTime = System.currentTimeMillis();
		System.out.println("Time: "+(endTime-startTime));
	}
} 
