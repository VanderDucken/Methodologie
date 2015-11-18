package test;
import java.util.*;

import classe.Tableau;

public class tri_tableau {
    public static void main (String args[]) {
        Tableau tab = new Tableau();
       
        tab.add(new Integer(2));
        tab.add(new Integer(5));
        tab.add(new Integer(13));
        tab.add(new Integer(7));
        tab.add(new Integer(17));
        tab.add(new Integer(3));
        tab.add(new Integer(0));
       
        System.out.println(tab);
       
        tab.tri();
       
        System.out.println("--------TRI---------\n");
        System.out.println(tab);
       
        tab.set(2, new Integer(14));

        System.out.println("-------MODIF--------\n");
        System.out.println(tab);

        tab.tri();
       
        System.out.println("--------TRI---------\n");
        System.out.println(tab);
       
        tab.add(new Integer(1));
        tab.add(new Integer(1));
        tab.set(2, new Integer(11));

        System.out.println("-------MODIF--------\n");
        System.out.println(tab);

        tab.tri();
       
        System.out.println("--------TRI---------\n");
        System.out.println(tab);
    }
}