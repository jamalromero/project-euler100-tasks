package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEulerTasks {

	@Test
	public void testTask1() {
		Task1 task1 = new Task1();
		assertTrue(task1.multiplesOf3and5(1000) == 233168);
		assertTrue(task1.multiplesOf3and5(49) == 543);
		assertTrue(task1.multiplesOf3and5(19564) == 89301183);
		assertTrue(task1.multiplesOf3and5(8456) == 16687353);
	}
	
	@Test
	public void testTask2() {
		Task2 task2 = new Task2();
		assertTrue(task2.fiboEvenSum(10) == 44);
		assertTrue(task2.fiboEvenSum(18) == 3382);
		assertTrue(task2.fiboEvenSum(23) == 60696);
		assertTrue(task2.fiboEvenSum(43) == 350704366);
	}

	@Test
	public void testTask3() {
		Task3 task3 = new Task3();
		assertTrue(task3.largestPrimeFactor(2) == 2);
		assertTrue(task3.largestPrimeFactor(3) == 3);
		assertTrue(task3.largestPrimeFactor(5) == 5);
		assertTrue(task3.largestPrimeFactor(7) == 7);
		assertTrue(task3.largestPrimeFactor(13195) == 29);
		assertTrue(task3.largestPrimeFactor(600851475143l) == 6857);
	}

	@Test
	public void testTask4() {
		Task4 task4 = new Task4();
		assertTrue(task4.largestPalindromeProduct(2) == 9009);
		assertTrue(task4.largestPalindromeProduct(3) == 906609);
	}	
}
