package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaKeywordTest {

	@Test
	public void test_null() {
		assertEquals(false, JavaKeyword.containsJavaKeyword(null));;
	}

	@Test
	public void test_empty() {
		assertEquals(false, JavaKeyword.containsJavaKeyword(""));;
	}
	
	@Test
	public void test_first_word() {
		assertEquals(true, JavaKeyword.containsJavaKeyword("Public schools are better than private schools"));;
	}
	
	@Test
	public void test_last_word() {
		assertEquals(true, JavaKeyword.containsJavaKeyword("I know what is a byte."));;
	}
	
	@Test
	public void test_upper_case() {
		assertEquals(true, JavaKeyword.containsJavaKeyword("ElSe she will be very sad."));;
	}
	
}
