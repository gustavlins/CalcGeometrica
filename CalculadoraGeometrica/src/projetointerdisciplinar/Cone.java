package projetointerdisciplinar;

import java.io.Serializable;

public class Cone extends Ponto implements Serializable{
    float altura, raioBase;

    public Cone() {
    }

    public Cone(float x, float y, float altura, float raioBase) {
        super(x, y);
        this.altura = altura;
        this.raioBase = raioBase;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getAltura() {
        return altura;
    }

    public float getRaioBase() {
        return raioBase;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setRaioBase(float raioBase) {
        this.raioBase = raioBase;
    }

    @Override
    public String toString() {
        return "\nGeratriz do Cone: " + geratriz() +
               "\nArea da base do Cone: " + areaBase() +
               "\nArea total do Cone: " + areaTotal() +
               "\nArea lateral do Cone: " + areaLateral() + 
               "\nVolume do cone: " + volume();
    }
   
    public double geratriz(){
        double g = Math.pow(altura,2)+Math.pow(raioBase,2);
        return Math.sqrt(g);
    }
    
    public double areaBase(){
        return Math.PI*Math.pow(raioBase,2); 
    }
    
    public double areaLateral(){
        return Math.PI*raioBase*geratriz();
    }
    
    public double areaTotal(){
        return Math.PI*raioBase*(raioBase+geratriz());
    }
    
    public double volume(){
        return (Math.PI*Math.pow(raioBase,2)*altura)/3;
    }
}
