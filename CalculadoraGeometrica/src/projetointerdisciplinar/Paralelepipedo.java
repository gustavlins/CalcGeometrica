package projetointerdisciplinar;

import java.io.Serializable;

public class Paralelepipedo extends Ponto implements Serializable{
    float altura, comprimento, largura;
    
    public Paralelepipedo(){
        
    }

    public Paralelepipedo(float x, float y, float altura, float comprimento, float largura) {
        super(x, y);
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "\nArea do Paralelepipedo: " + areaTotal() + "\nDiagonal: " + calculoDiagonal() + "\nVolume: " + calculoVolume();
    }
    
    public float areaTotal(){
        return 2*(altura*comprimento)+2*(comprimento*largura)+2*(altura*largura);
    }
    
    public double calculoDiagonal(){
        return Math.pow(altura, 2)+Math.pow(comprimento, 2)+Math.pow(largura, 2);
    }
    
    public float calculoVolume(){
        return altura*comprimento*largura;
    }
    
}
