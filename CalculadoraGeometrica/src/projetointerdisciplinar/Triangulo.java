package projetointerdisciplinar;

import java.io.Serializable;

public class Triangulo extends Ponto implements Serializable{
    float ladoA, ladoB, ladoC;

    public Triangulo() {
    }

    public Triangulo(int x, int y,float ladoA, float ladoB, float ladoC) {
        super(x,y);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }
    
    @Override
    public String toString() {
        return "\nÁrea do Triangulo: " + areaTotal() + "\nPerímetro: " + calculoPerimetro();
    }
    
    public float areaTotal(){
        return ladoA*ladoB/2;
    }

    public float calculoPerimetro(){
        return ladoA+ladoB+ladoC;
    }
}
