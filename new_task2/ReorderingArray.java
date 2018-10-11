package newTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class ReorderingArray {
	static void smallToBigReorder(int array[], int arrayLength) {
		for (int i = 0; i < arrayLength; i++) {
			int intMaxValue = Integer.MAX_VALUE;
			int flag = -1;
			for (int j = 0; j < arrayLength; j++) {
				if (array[i] < array[j] && array[j] - array[i] < intMaxValue) {
					intMaxValue = array[j] - array[i];
					flag = j;
				}
			}
			if (flag == -1)
				System.out.print("_ ");
			else
				System.out.print(array[flag] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize = scan.nextInt();
		System.out.println("Enter array elements");
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = scan.nextInt();
		}
		int arrayLength = array.length;
		smallToBigReorder(array, arrayLength);
	}
}
