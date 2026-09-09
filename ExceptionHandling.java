class ExceptionHandling {
	public static void main(String[] args) {
		try {
			System.out.println("Program Started...");
			int[] arr = {1, 2, 3, 4, 5};
			System.out.println(arr[1]);

			int result = 10/0;

		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array element does not exist.");

		} catch(ArithmeticException e) {
			System.out.println("cannot divide by 0.");

		} catch(Exception e) {
			System.out.println("Error in program");

		} finally {
			System.out.println("Finally Block runs");
		}
		System.out.println("Program Ended...");
	}
}
