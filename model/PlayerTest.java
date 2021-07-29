package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	
	private Player player1;
	private Player player2;
	

	@Before
	public void setUp() throws Exception {
		
		player1= new Wizard  (40,6,3,60);
		player2= new Elf(25,2,10,40);
		
			
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
