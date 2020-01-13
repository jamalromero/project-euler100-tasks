package euler;

/*
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
 */
public class Task5 {

	/*
	 * I know there must be a way to find the lcm for more that 2 numbers.
	 * Here I am finding the lcm in pairs. So if we have
	 * 2, 3, 4, 5
	 * I do lcm of 2 and 3 ---> 6
	 * then lcm of 6 and 4 ----> 12
	 * then lcm  of 12 and 5 ----> 60
	 */
	public long smallestMult(int max) {
		long lcm = 1;
		while(max >= 1) {
			lcm = getLeastCommonMultiple(lcm, max);
			max--;
		}
		return lcm;
	}
	
	/*
	 * lcm(a, b) = ab/gcd(a,b)
	 */
	private long getLeastCommonMultiple(long a, long b) {
		long gfc = getGreatestCommonFactor(a, b);
		return (a * b) / gfc;
	}
	
	/*
	 * Find the greatest number, then iterate up to its square root.
	 * the last gfc found will be the greatest common factor.
	 */
	private long getGreatestCommonFactor(long a, long b) {
		long gfc = 1;
		if(a == b) {
			return a;
		}
		long searchLimit = a < b ? b : a;
		for( long i = 1;  i <= Math.sqrt(searchLimit); i++) {
			if(a % i == 0 && b % i == 0) {
				gfc = i;
			}
		}
		return gfc;
	}
	
}
