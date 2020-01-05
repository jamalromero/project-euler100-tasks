package euler;

/*
 * Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
 */
public class Task1 {

	public long multiplesOf3and5(int number) {
		long sum = 3;
		for (int i = 5; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
