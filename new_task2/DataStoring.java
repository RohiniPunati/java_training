package newTask2;

import java.util.Arrays;
import java.util.Scanner;

public class DataStoring {
	static void addSameNum(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[i] = array[i] + array[j];
					array[j] = 0;
				}
			}
		}
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		String s = Arrays.toString(array);
		System.out.println("Array : " + s);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of elements");
		int size = s.nextInt();
		int array[] = new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		addSameNum(array);
	}
}
