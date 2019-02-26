package projetointerdisciplinar;

import java.io.Serializable;

public class Ponto implements Serializable{
    public float x;
    public float y;
    
    public Ponto(){
        
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Pontos: X= " + x + " Y= " + y;
    }
    
}


    