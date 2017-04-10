package by.htp.arrayswapmaxposition;

public class Swap {
	public static void main(String[] args) {
		// creating array matrix with two-dimensional array
		int x = 5; // (int) (Math.random() * 5 + 1);
		int y = 5; // (int) (Math.random() * 5 + 1);
		int[][] arr = new int[x][y];
		// filling the first array
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
		// printing the first array
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}

		int max = -1;
		// looking for max value
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}

		}
		System.out.println("Maximum value:" + max);

		int coordX = 0;
		int coordY = 0;
		boolean foundMax = false;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (max == arr[i][j]) {
					coordX = i;
					coordY = j;
					foundMax = true;
					break;
				}

			}
			if (foundMax) {
				break;
			}

		}
		System.out.println("x coord:" + coordX);
		System.out.println("y coord:" + coordY);

		int[][] finarr = new int[x][y];
		int[][] temparr = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (coordY == j) {
					temparr[i][0] = arr[i][j];
					temparr[i][j] = arr[i][0];
				} else {
					temparr[i][j] = arr[i][j];
				}
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (coordX == i) {
					finarr[0][j] = temparr[i][j];
					finarr[i][j] = temparr[0][j];
				} else {
					finarr[i][j] = temparr[i][j];
				}
			}
		}

		// printing final array
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(finarr[i][j]);
			}
			System.out.println();
		}

		System.out.println("Yaremenko. Got task 06.04.2017. Finished task 10.04.2017.");
	}

}
