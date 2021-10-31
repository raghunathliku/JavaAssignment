package com.technoelevate.javaassignment.arrays;

public class ArrayAverageCalculation {

	public static void main(String[] args) {
		int[] arr = {20,30,25,35,-16,10,-80};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double arrAvg=sum/arr.length;
		System.out.println("Average of the given array is "+arrAvg);
	}

}
