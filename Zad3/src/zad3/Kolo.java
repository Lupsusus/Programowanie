
package zad3;


public class Kolo {
    
    float r;
    String kolor;
    
    public Kolo()
    {
        r=1;
        kolor="#FFFFFF";
    }
    public Kolo(float r, String kolor)
    {
        this.r=r;
        this.kolor=kolor;
   
    }
    public Kolo(Kolo pkt)
    {
        this.r=pkt.r;
        this.kolor=pkt.kolor;
    }
    public float getPromien()
    {
        return r;
    }
    public String getKolor()
    {
        return kolor;
    }
    public void setPromien(float r)
    {
        this.r=r;
    }
    public void setKolor(String kolor)
    {
        this.kolor=kolor;
        
    }
    public float pole()
    {
        return 3.14f*r*r;
    }
    public float obwod()
    {
        return 2f*3.14f*r;
    }
    public void wypisz()
    {
        System.out.println("Promien: "+r);
        System.out.println("Kolor: "+ kolor);
        System.out.println("Obwod: "+ obwod());
        System.out.println("Pole: "+ pole());
    }
}
