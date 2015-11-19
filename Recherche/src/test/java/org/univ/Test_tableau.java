package org.univ;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class Test_tableau {
	

	@Test
	public void testRecherche() throws Exception{
		Tableau tab_test = new Tableau();
									  // Indexes :
		tab_test.add(new Integer(1)); // 0
		tab_test.add(new Integer(2)); // 1
		tab_test.add(new Integer(1)); // 2
		tab_test.add(new Integer(2)); // 3
		tab_test.add(new Integer(3)); // 4
		tab_test.add(new Integer(8)); // 5
		tab_test.add(new Integer(7)); // 6
		tab_test.add(new Integer(5)); // 7
		
		ArrayList res_1 = tab_test.recherche(new Integer(3)); // Test une seule valeur trouvée
		ArrayList res_2 = tab_test.recherche(new Integer(2)); // Test deux valeurs trouvées
		ArrayList res_3 = tab_test.recherche(new Integer(6)); // Test aucune valeur trouvée
		
		assertTrue(res_1.get(0).equals(new Integer(4)));
		assertTrue(res_1.size() == 1);
		assertTrue(res_2.get(0).equals(new Integer(1)));
		assertTrue(res_2.get(1).equals(new Integer(3)));
		assertTrue(res_2.size() == 2);
		assertTrue(res_3.size() == 0);
	}
}