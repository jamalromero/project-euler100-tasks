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


}
