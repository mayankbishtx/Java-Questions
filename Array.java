import java.util.Arrays;

class Array {
	public static void main(String[] args) {
		// String[] cars = {"Ferrari", "Buggati", "Supra", "Aston Martin", "Tesla"};
		// System.out.println(cars[0]);
		// System.out.println(Arrays.toString(cars));

		// for (String car: cars) {
		// 	System.out.println(car);
		// }

		int[][] myArrays = { {1, 2, 3}, {4, 5, 6} };

		// System.out.println(myArrays[0][2]);
		// System.out.println(myArrays[1][2]);

		// for (int row[]: myArrays) {      print array using for each loop
		// 	for (int num: row) {
		// 		System.out.println(num);
		// 	}
		// }

		for (int row = 0; row < myArrays.length; row++) {
			for (int col = 0; col < myArrays[row].length; col++) {
				System.out.println("myArrays[" + row + "][" + col + "] = " + myArrays[row][col]);
			}
		}

	}
}
