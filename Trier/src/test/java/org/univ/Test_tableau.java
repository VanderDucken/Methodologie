package org.univ;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class Test_tableau {
	
	@Test
	public void testTri() {
		Tableau tab_test = new Tableau();
		tab_test.add(new Integer(1));
		tab_test.add(new Integer(2));
		tab_test.add(new Integer(3));
		tab_test.add(new Integer(5));
		
		tab_test.tri();
		
		assertTrue(tab_test.get(0).equals(new Integer(1)));
		assertTrue(tab_test.get(1).equals(new Integer(2)));
		assertTrue(tab_test.get(2).equals(new Integer(3)));
		assertTrue(tab_test.get(3).equals(new Integer(5)));
	}
	

}