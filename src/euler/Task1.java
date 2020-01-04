package euler;

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
