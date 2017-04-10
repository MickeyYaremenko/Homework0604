package by.htp.risingsequence;

import java.util.Arrays;

public class ArraySequence {

	public static void main(String[] args) {
		// creating array matrix with two-dimensional array
		int x = 5; // (int) (Math.random() * 5 + 1);
		int y = 5; // (int) (Math.random() * 5 + 1);
		// int[][] arr = new int[x][y];
		// // filling the first array
		// for (int i = 0; i < x; i++) {
		// for (int j = 0; j < y; j++) {
		// arr[i][j] = (int) (Math.random() * 10);
		// }
		// }
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// printing the first array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}

		int sequenceCounter = 0;
		int maxSequence = 0;
		int current = -1;
		int previous = -1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (j == 0) {
					if (previous < arr[i][j]) {
						sequenceCounter++;
						if (maxSequence < sequenceCounter)
							maxSequence = sequenceCounter;
					} else {
						sequenceCounter = 0;
					}
				} else {
					current = arr[i][j];
					if (current < arr[i][j + 1]) {
						sequenceCounter++;
						if (maxSequence < sequenceCounter)
							maxSequence = sequenceCounter;
					} else {
						sequenceCounter = 0;
					}
				}
			}
			previous = current;
		}
		System.out.println("maxs" + maxSequence);

		int[] secuenceArray = new int[maxSequence];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] < arr[i][j + 1]) {
					sequenceCounter++;
					if (maxSequence == sequenceCounter) {
						secuenceArray = sequenceArray(i, j, maxSequence, arr);
					}
				}
			}
		}

		System.out.println(Arrays.toString(secuenceArray));

	}

	private static int[] sequenceArray(int a, int b, int length, int[][] array) {
		int[] sequenceArray = new int[length];
		int tempCounter = 0;
		for (int i = 0; i < length; i++) {
			while (b >= 0) {
				sequenceArray[i] = array[a][b];
				b--;
			}
			a--;
			b = array[a].length;
		}
		// for (int i = a; i < array.length; i--){
		// for (int j = b; j < array[i].length; j--){
		// sequenceArray[tempCounter] = array[i][j];
		// tempCounter++;
		// }
		// }
		//
		return sequenceArray;

	}

}
