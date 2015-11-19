package org.univ;
import java.util.*;

import org.junit.Test;

public class Tableau extends ArrayList {
    public Tableau(){
        super();
    }
   
    // Méthodes:
    @Test
    public ArrayList recherche(Object rech) {
        ArrayList res = new ArrayList();
       
        for (int i = 0; i < this.size(); i++)
            if (rech.equals(this.get(i)))
                res.add(new Integer(i));
        
        return res;
    }
   
    public String toString() {
        String s = new String("");
        for (int i = 0; i < this.size(); i++){
            s += "[" + i + "] = ";
            s += this.get(i);
            s += "\n";
        }
        return s;
    }
}