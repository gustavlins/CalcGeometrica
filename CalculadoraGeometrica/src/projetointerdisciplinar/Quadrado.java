package projetointerdisciplinar;

import java.io.Serializable;

public class Quadrado extends Ponto implements Serializable{
    float ladoA, ladoB, ladoC, ladoD;

    public Quadrado() {
    }

    public Quadrado(int x, int y, float ladoA, float ladoB) {
        super(x,y);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }


    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "\nÁrea do quadrado: " + areaTotal() + "\nPerímetro: " + calculoPerimetro();
    }
    
    public float areaTotal(){
        return ladoA*ladoB;
    }

    public float calculoPerimetro(){
        return ladoA*4;
    }

}
