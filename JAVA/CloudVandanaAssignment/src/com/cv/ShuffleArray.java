package com.cv;

import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6};
				System.out.println("Original Array: ");

				printArray(arr);

		        System.out.println("Shuffled array: ");

				shuffleArray(arr);
				printArray(arr);

		        
		    }

		    private static void printArray(int[] arr) {
		    	for(int i=0;i<arr.length;i++) 
		            System.out.print(arr[i] + " ");
		    	System.out.println();
		    	}

			public static void shuffleArray(int[] arr) {
		        Random rnd = new Random();
		        for (int i = arr.length - 1; i > 0; i--) {
		            int index = rnd.nextInt(i + 1);
		            int temp = arr[index];
		            arr[index] = arr[i];
		            arr[i] = temp;
		        }
	}

}
