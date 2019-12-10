import java.util.Scanner;

public class Examples02 {

	private Scanner input = new Scanner(System.in);

	public void PrimitiveTypesMinMax() {

		System.out.println("int(min) = " + Integer.MIN_VALUE);
		System.out.println("int(max) = " + Integer.MAX_VALUE);
		System.out.println("int(bit-length) = " + Integer.SIZE);
		// byte (8-bit signed integer)
		System.out.println("byte(min) = " + Byte.MIN_VALUE);
		System.out.println("byte(max) = " + Byte.MAX_VALUE);
		System.out.println("byte(bit-length)=" + Byte.SIZE);
		// short (16-bit signed integer)
		System.out.println("short(min) = " + Short.MIN_VALUE);
		System.out.println("short(max) = " + Short.MAX_VALUE);
		System.out.println("short(bit-length) = " + Short.SIZE);
		// long (64-bit signed integer)
		System.out.println("long(min) = " + Long.MIN_VALUE);
		System.out.println("long(max) = " + Long.MAX_VALUE);
		System.out.println("long(bit-length) = " + Long.SIZE);
		// char (16-bit character or 16-bit unsigned integer)
		System.out.println("char(min) = " + (int) Character.MIN_VALUE);
		System.out.println("char(max) = " + (int) Character.MAX_VALUE);
		System.out.println("char(bit-length) = " + Character.SIZE);
		// float (32-bit floating-point)
		System.out.println("float(min) = " + Float.MIN_VALUE);
		System.out.println("float(max) = " + Float.MAX_VALUE);
		System.out.println("float(bit-length) = " + Float.SIZE);
		// double (64-bit floating-point)
		System.out.println("double(min) = " + Double.MIN_VALUE);
		System.out.println("double(max) = " + Double.MAX_VALUE);
		System.out.println("double(bit-length) = " + Double.SIZE);
	}

	public void OddEvenSum() {
		int lowerbound = 1, upperbound = 1000;
		int sumOdd = 0; // For accumulating odd numbers, init to 0
		int sumEven = 0; // For accumulating even numbers, init to 0
		int number = lowerbound;
		while (number <= upperbound) {
			if (number % 2 == 0) { // Even
				sumEven += number; // Same as sumEven = sumEven + number
			} else { // Odd
				sumOdd += number; // Same as sumOdd = sumOdd + number
			}
			++number; // Next number
		}
		// Print the result
		System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sumOdd);
		System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + "  is " + sumEven);
		System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
	}

	public void NonPrimeList() {
		int upperbound = 100;
		for (int number = 2; number <= upperbound; ++number) {
			// Not a prime, if there is a factor between 2 and sqrt(number)
			int maxFactor = (int) Math.sqrt(number);
			for (int factor = 2; factor <= maxFactor; ++factor) {
				if (number % factor == 0) { // Factor?
					System.out.println(number + " is NOT a prime");
					break; // A factor found, no need to search for more factors
				}
			}
		}
	}

	public void PrimeList() {
		int upperbound = 100;
		for (int number = 2; number <= upperbound; ++number) {
			// Not prime, if there is a factor between 2 and sqrt of number
			int maxFactor = (int) Math.sqrt(number);
			boolean isPrime = true;
			int factor = 2;
			while (isPrime && factor <= maxFactor) {
				if (number % factor == 0) { // Factor of number?
					isPrime = false;
				}
				++factor;
			}
			if (isPrime)
				System.out.println(number + " is a prime");
		}
	}

	/* * A mystery series created using break and continue */
	public void MysterySeries() {
		int number = 1;
		while (true) {
			++number;
			if ((number % 3) == 0)
				continue;
			if (number == 133)
				break;
			if ((number % 2) == 0) {
				number += 3;
			} else {
				number -= 3;
			}
			System.out.print(number + " ");
		}
	}

	// determines the two largest of 10 numbers
	public void TwoLargest() {
		int largest; // largest number
		int nextLargest; // second largest number
		int number; // user input
		int counter; // number of values entered

		// get first number and assign it to variable largest
		System.out.print("Enter number: ");
		largest = input.nextInt();

		// get second number and compare it with first number
		System.out.print("Enter number: ");
		number = input.nextInt();

		if (number > largest) {
			nextLargest = largest;
			largest = number;
		} // end if
		else
			nextLargest = number;

		counter = 2;

		// get rest of the numbers and find the largest and nextLargest
		while (counter < 10) {
			System.out.print("Enter number: ");
			number = input.nextInt();

			if (number > largest) {
				nextLargest = largest;
				largest = number;
			} // end if
			else if (number > nextLargest)
				nextLargest = number;

			counter++;
		} // end while loop

		System.out.printf("Largest is %d\nSecond largest is %d\n", largest, nextLargest);
	}

	// draws a diamond of asterisks
	public void drawDiamond() {
		int row; // the current row
		int stars; // the number of stars
		int spaces; // the number of spaces

		// top half (1st five lines)
		for (row = 1; row <= 5; row++) {
			for (spaces = 5; spaces > row; spaces--)
				System.out.print(" ");

			for (stars = 1; stars <= (2 * row) - 1; stars++)
				System.out.print("*");

			System.out.println();
		} // end for statement

		// bottom half (last four rows)
		for (row = 4; row >= 1; row--) {
			for (spaces = 5; spaces > row; spaces--)
				System.out.print(" ");

			for (stars = 1; stars <= (2 * row) - 1; stars++)
				System.out.print("*");

			System.out.println();
		} // end for statement
	}

}
