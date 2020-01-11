package euler;

/*
 * Find the largest palindrome made from the product of two n-digit numbers.
 */
public class Task4 {

	public long largestPalindromeProduct(int nDigits) {
		long largestPalindromeProduct = 0;
		long lowestLimit = getLowestLimit(nDigits);
		long highestLimit = getHighestLimit(nDigits);
		for(long possibleNumber = highestLimit; possibleNumber >= lowestLimit; possibleNumber--) {
			if(isPalindrome(possibleNumber) && fitsCriteria(possibleNumber)) {
				largestPalindromeProduct = possibleNumber;
				break;
			}
		}
		return largestPalindromeProduct;
	}
	
	/*
	 * Checks if the number is a product of two divisors 
	 * with same number of digits
	 */
	private boolean fitsCriteria(long number) {
		boolean fitsCriteria = false;
		for(long divisor = 1; divisor <= Math.sqrt(number); divisor++) {
			if(number % divisor == 0) {
				long divisorPair = number / divisor;
				if(orderOfMagnitude(divisor) == orderOfMagnitude(divisorPair)) {
					fitsCriteria = true;
					break;
				}
			}
		}
		return fitsCriteria;
	}
	
	/*
	 * Returns how many digits in a number
	 */
	private int orderOfMagnitude(long number) {
		int magnitude = 0;
		while(number > 0) {
			number -= number % 10;
			number /= 10;
			magnitude++;
		}
		return magnitude;
	}
	
	/*
	 * Returns the highest product of two numbers with nDigits each
	 */
	private long getHighestLimit(int nDigits) {
		long highestLimit = 0;
		while(nDigits >= 0) {
			highestLimit += Math.pow(10, nDigits - 1) * 9;
			nDigits--;
		}
		return highestLimit * highestLimit;
	}
	
	/*
	 * Returns the lowest product of two numbers with nDigits each
	 */
	private long getLowestLimit(int nDigits) {
		return (long)Math.pow(10, (nDigits - 1) * 2);
	}
	
	
	/*
	 * Checks if the number is palindromic
	 */
	private boolean isPalindrome(long number) {
		if(number % 10 == 0) {
			return false;
		}
		long copy = number;
		long reverse = 0;
		while(copy != 0) {
			reverse *= 10;
			reverse += copy % 10;
			copy /= 10;
		}
		return reverse == number;
	}
	
}
