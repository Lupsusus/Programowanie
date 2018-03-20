/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

/**
 *
 * @author wyruu
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.*;
public class Zad4 {

    static Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
      try{
      System.out.println("Podaj kolor: ");
      String kolor=sc.next(); 
      string(kolor);
      
      System.out.println("Podaj x: ");
      float x=sc.nextInt(); 
      System.out.println("Podaj y: ");
      float y=sc.nextInt(); 
      System.out.println("Podaj z: ");
      float z=sc.nextInt(); 
        
        Punkt p1=new Punkt();
        Punkt p2=new Punkt(p1);
        Punkt p3=new Punkt(x,y,z,kolor);
        
      System.out.println(p1.wypisz());
      System.out.println(p2.wypisz());
      System.out.println(p3.wypisz());
        
      odleglosc(p1,p2,p3);
      
      System.out.println("Podaj o ile przesunac x: ");
      float x1=sc.nextInt(); 
      System.out.println("Podaj o ile przesunac y: ");
      float y1=sc.nextInt(); 
      System.out.println("Podaj o ile przesunac z: ");
      float z1=sc.nextInt();
      
      p1.przesun(x1,y1,z1);
      p2.przesun(x1,y1,z1);
      p3.przesun(x1,y1,z1);
      
      System.out.println(p1.wypisz());
      System.out.println(p2.wypisz());
      System.out.println(p3.wypisz());
      }
      catch(InputMismatchException e)
      {
          System.err.println("Wyjatek " +e);
      }
      catch(IllegalArgumentException e)
      {
          System.err.println("Wyjatek " +e);
      }
      
        
    }
    
    
    public static void odleglosc(Punkt p1,Punkt p2,Punkt p3)
    {
        double pom1,pom2;
        pom1=sqrt((p1.getX()+p2.getX())*(p1.getX()+p2.getX())+(p1.getY()+p2.getY())*(p1.getY()+p2.getY())+(p1.getZ()+p2.getZ())*(p1.getZ()+p2.getZ())); // 1 od 2
        pom2=sqrt((p1.getX()+p3.getX())*(p1.getX()+p3.getX())+(p1.getY()+p3.getY())*(p1.getY()+p3.getY())+(p1.getZ()+p3.getZ())*(p1.getZ()+p3.getZ())); //1 od 3
        
        System.out.println("Odlegloscp punkt 1 od 2=" + pom1);
        System.out.println("Odlegloscp punkt 1 od 3=" + pom2);
        
    }
    
        public static void string(String kolor)
    {
     
     
     char result = kolor.charAt(0);
     if(result!='#')
     {
         throw new IllegalArgumentException("Brak #");
     }
     else
     {
         if(kolor.length()!=7)
         {
             throw new IllegalArgumentException("Zla dlugosc");
         }
         else
         {
             for(int i=1;i<7;i++)
             {      
                 result = kolor.charAt(i);
                 
                if(result>='A' || result<='F' || result>=0 && result<=9 )
                {
                    
                }
                else
                    throw new IllegalArgumentException("Zle znaki");

             }
         }
         
     }
    }
    
}
