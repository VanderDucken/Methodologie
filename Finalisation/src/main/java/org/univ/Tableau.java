package org.univ;
import java.util.*;

import org.junit.Test;

public class Tableau extends ArrayList {
    public Tableau(){
        super();
    }
   
    // Méthodes:
    
     
    private int plusPetit(ArrayList rech) {
       
        int indice = 0;
        int min =  Integer.parseInt(rech.get(0).toString());
        for (int j = 0; j < rech.size(); j++) {
            if (Integer.parseInt(rech.get(j).toString()) < min) {
                min = Integer.parseInt(rech.get(j).toString());
                indice = j;
            }
        }
       
        return indice;
    }
    
    @Test
    public void tri() {
        for (int i = 0; i < this.size(); i++) {
            Object echange = this.get(i);
           
            ArrayList tab_temp = new ArrayList();
            for (int j = 0; j < this.size() - i; j++)
                tab_temp.add(this.get(i+j));
           
            int indice_temp = this.plusPetit(tab_temp);
            this.set(i, this.get(i + indice_temp));
           
            this.set(i + indice_temp, echange);
        }
    }
    
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