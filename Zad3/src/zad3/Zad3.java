
package zad3;


import java.util.Scanner;
import java.util.InputMismatchException;
public class Zad3 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {   
              
    try{
      System.out.println("Podaj kolor: ");
      String kolor=sc.next(); 
      string(kolor);
      
      System.out.println("Podaj promien: ");
      int r=sc.nextInt(); 

    Kolo k1=new Kolo();
    Kolo k2=new Kolo(k1);
    Kolo k3=new Kolo(r,kolor);     
    
      k1.wypisz();
      k2.wypisz();
      k3.wypisz();
      
      if(porownanie(k1,k2,k3)==true)
           System.out.println("Kola sa takie same ");
      else
           System.out.println("Kola nie sa takie same");
     
     System.out.println("Podaj nowy promien dla k2: ");
     int r1=sc.nextInt();
     k2.setPromien(r1);
    
     System.out.println("Podaj nowy kolor dla k2: ");
     String kolor1=sc.next(); 
     string(kolor1);
     k2.setKolor(kolor1);
     
     System.out.println("Podaj nowy promien dla k3: ");
     int r2=sc.nextInt(); 
     k3.setPromien(r2);
     System.out.println("Podaj nowy kolor dla k3: ");
     String kolor2=sc.next(); 
     string(kolor2);
     k3.setKolor(kolor2);
     
    k1.wypisz();
    System.out.println();
    k2.wypisz();
    System.out.println();
    k3.wypisz();
      
    if(porownanie(k1,k2,k3)==true)
        System.out.println("Kola sa takie same ");
      else
        System.out.println("Kola nie sa takie same");
    }
    catch(IllegalArgumentException e )
    {
        System.err.println("Wyjatek w string"+ e);
    }
    catch(InputMismatchException e)
    {
        System.err.println("Wyjatek ");
    }

    }
    
    public static boolean porownanie(Kolo k1,Kolo k2,Kolo k3)
    {
        return k1.pole()==k2.pole() && k1.pole()==k3.pole() && k1.obwod()==k2.obwod() && k1.obwod()==k3.obwod();
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
