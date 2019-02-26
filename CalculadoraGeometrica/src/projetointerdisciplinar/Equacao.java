package projetointerdisciplinar;

import java.io.Serializable;

public class Equacao implements Serializable{
    float a,b,c;

    public Equacao() {
    }

    public Equacao(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "\nDelta: " + delta() + "\nX1: " + x1() + "\nX2: " + x2();
    }
    	
    public float delta() {
	return (b * b - 4 * a * c);
    }
    
    public Double x1(){
        return ((-b + Math.sqrt(delta())) / (2*a));
    }
    
    public Double x2(){
        return ((-b - Math.sqrt(delta())) / (2*a));
    }
}
