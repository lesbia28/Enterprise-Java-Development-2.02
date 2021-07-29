package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test_positive() {
		int[] expected= {1,3,5,7,9};
		int[] result=Array.oddsToArray(9);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_negative() {
		int[] expected= {};
		int[] result=Array.oddsToArray(-3);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_one_value() {
		int[] expected= {1};
		int[] result=Array.oddsToArray(1);
		assertArrayEquals(expected, result);
	}

}
