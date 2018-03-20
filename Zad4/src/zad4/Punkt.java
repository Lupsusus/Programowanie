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
public class Punkt {

    private float x, y, z;
    private String kolor;

    public Punkt() {
        x = 1;
        y = 1;
        z = 1;
    }
    
    public Punkt(Punkt pkt){
        this.x=pkt.x;
        this.y=pkt.y;
        this.z=pkt.z;
        this.kolor=pkt.kolor;
    }

    public Punkt(float x, float y, float z, String kolor) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.kolor = kolor;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public String getKolor() {
        return kolor;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public void przesun(float x,float y, float z)
    {
        this.x+=x;
        this.y+=y;
        this.z+=z;
    }
    public String wypisz(){

             return ("x: "+x+ " y: "+y+" z: "+z+" kolor: "+kolor);
    }






}
