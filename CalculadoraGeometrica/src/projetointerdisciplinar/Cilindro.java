package projetointerdisciplinar;

import java.io.Serializable;

public class Cilindro extends Ponto implements Serializable{
    float altura, raioBase;

    public Cilindro() {
    }

    public Cilindro(float x, float y, float altura, float raioBase) {
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
        return "\nArea do Cilindro: "+ areaTotal() + 
               "\nArea base do Cilindro: " + areaBase() +
               "\nArea lateral do Clindro: " + areaLateral() +
               "\nVolume total do Cilindro: " + volumeTotal();
    }

    public double areaTotal(){
        return (2*Math.PI)*raioBase*(raioBase+altura);
    }
    
    public double areaBase(){
        return Math.PI*(Math.pow(raioBase, 2));
    }
    
    public double areaLateral(){
        return (2*Math.PI)*raioBase*altura;
    }
    
    public double volumeTotal(){
        return areaBase()*altura;
    }
}