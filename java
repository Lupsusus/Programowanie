
package zad.pkg1;

import java.util.Random;
import java.util.Scanner;

 

public class Zad1 {
    
    static Scanner sc = new Scanner(System.in);
    
    static Random rnd = new Random();
    public static void main(String[] args) {
    
      System.out.println("Podaj wielkosc tablicy: ");
      int r=sc.nextInt();   
      
       TablicaLiczb t1 = new TablicaLiczb(r);
       t1.losowanie();
       t1.wypisz(); 
        
    }
    
}
////////////////////////////////////////////////////////////////


package zad.pkg1;

import java.util.Random;


public class TablicaLiczb {
    
    int n;
    int tab[];
    
    static Random rnd = new Random();
    
    public TablicaLiczb(int n)
    {
        this.n=n;
        tab=new int [n];
    }

  
    public int[] losowanie() 
    {
        for(int i=0;i<tab.length;i++)
        {
            
            tab[i]= rnd.nextInt(1000)+1;
            
            
        }
        return tab;
        
    }
       public void wypisz(){
        for (int i=0; i<n; i++)
            System.out.println(tab[i]);
    }
}   
