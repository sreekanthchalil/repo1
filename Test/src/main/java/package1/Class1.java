package package1;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Initialize sum variable
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all number in the array" + sum);
	}

}
