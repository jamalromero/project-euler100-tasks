package euler;


/*
 * By considering the terms in the Fibonacci sequence that do not exceed the nth term, find the sum of the even-valued terms.
 */
public class Task2 {

	
	public long fiboEvenSum(int limit) {
		int currentFibonacciNumber = 2;
		int previousFibonacciNumber = 1;
		int newFibonacciNumber;
		int counter = 2;
		long sum = 2;		
		while(counter < limit) {
			newFibonacciNumber = currentFibonacciNumber + previousFibonacciNumber;
			if(newFibonacciNumber % 2 == 0) {
				sum += newFibonacciNumber;
			}
			previousFibonacciNumber = currentFibonacciNumber;
			currentFibonacciNumber = newFibonacciNumber;
			counter++;
		}
		return sum;
	}
}
