package euler;

/*
 * What is the largest prime factor of the given number?
 */
public class Task3 {

	public long largestPrimeFactor(long number) {
		long primeFactor = 2;
		while(number >= primeFactor * primeFactor) {
			if(number % primeFactor == 0) {
				number = number / primeFactor;
			} else {
				primeFactor++;
			}
		}
		return number;
	}	

}
