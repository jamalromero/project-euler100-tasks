package euler;

public class Task1NoLoops {

	/*
	 * With this method I am borrowing the idea of calculating of the sum
	 * of a sequence of natural numbers 1 + 2 + 3 + ....+ n
	 * If we consider a concrete example like the sum of multiple of 3 or 5 below 20
	 * We could calculate the sum of multiple of 3 and 5 separately then add them afterwards
	 * Now if take multiples of 3 less than 20, we get:
	 * 3, 6, 9, 12, 15, 18
	 * Let's call Sof3 the sum of all these multiples. So:
	 * Sof3 = 3 + 6 + 9 + 12 + 15 + 18
	 *      = 3 * (1 + 2 + 3 + 4 + 5 + 6)	 
	 * A we know from elementary math how to calculate (1 + 2 + 3 + 4 + 5 + 6)
	 * General formulae is (n * (n + 1)) / 2 where n is the number of elements which in our case is 6
	 * Easily demonstrable like in here: https://www.youtube.com/watch?v=5jJ55eFqM9s
	 * Then applying this formulae in our case we get:
	 * 1 + 2 + 3 + 4 + 5 + 6 = (6 * (6 + 1)) / 2 = 21
	 * Finally we can say
	 * Sof3 = = 3 * (1 + 2 + 3 + 4 + 5 + 6) = 3 * ((6 * (6 + 1)) / 2) = 63
	 * So to be able to apply the formulae all we need to know is 
	 * how many multiples of 3 are below 20. For that we could just do:
	 * NumberOfMultiplesOf3Below20 = (20 - (20 % 3)) / 3
	 * The same method could be applied to multiples of 5 or any number.
	 * 
	 *  Now after getting the sum of all multiples of 3 and the sum of all multiples of 5
	 *  We can just add them together. And in this case we have the overall sum.
	 *  One last thing we have to adjust is that in the problem enunciation 
	 *  It is said the sum of multiples of 3 OR 5.
	 *  This method will duplicate the multiples of 3 AND 5 like 15 for example will be 
	 *  added twice. So in that case we have to subtract the sum of multiples of 15 using exactly the technique
	 *  Other little adjustment we need to, because as said the multiples should be BELOW the number
	 *  So if the number is divisible by 3 we need to decrement by 1 the number of multiples. 
	 */
	public long multiplesOf3and5(long number) {
		long numberOfMultiplesOf3 = (number - (number % 3)) / 3;
		long numberOfMultiplesOf5 = (number - (number % 5)) / 5;
		long numberOfMultiplesOf3And5 = (number - (number % 15)) / 15;

		if(number % 3 == 0) {
			numberOfMultiplesOf3--;
		}

		if(number % 5 == 0) {
			numberOfMultiplesOf5--;
		}

		if(number % 15 == 0) {
			numberOfMultiplesOf3And5--;
		}
		
		long sumOfMutliplesOf3 = 3 * ((numberOfMultiplesOf3 * (numberOfMultiplesOf3 + 1)) / 2);
		long sumOfMutliplesOf5 = 5 * ((numberOfMultiplesOf5 * (numberOfMultiplesOf5 + 1)) / 2);
		long sumOfMutliplesOf3And5 = 15 * ((numberOfMultiplesOf3And5 * (numberOfMultiplesOf3And5 + 1)) / 2);

		return (sumOfMutliplesOf3 + sumOfMutliplesOf5) - sumOfMutliplesOf3And5;
	}
}
