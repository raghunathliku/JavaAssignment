package com.technoelevate.javaassignment.arrays;

public class BubbleSortingArray {

	public static void main(String[] args) {
		int arr[]= {32,45,34,67,12,82};
		for (int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
				
				
			}
		}
		System.out.println("Ascending order...");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("Descending order...");

		//for descending order...
		for (int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
				
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
