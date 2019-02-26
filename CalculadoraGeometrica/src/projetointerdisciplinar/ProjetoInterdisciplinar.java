package projetointerdisciplinar;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ProjetoInterdisciplinar {

    private ArrayList figuras = new ArrayList();
    
    public static void main(String[] args) {
        new ProjetoInterdisciplinar();
    }
    
    public ProjetoInterdisciplinar() {

        figuras.add(new Quadrado(0,0,5,5));
        figuras.add(new Quadrado(0,0,10,10));
        figuras.add(new Quadrado(0,0,9,9));
        figuras.add(new Quadrado(0,0,8,8));
        figuras.add(new Quadrado(0,0,6,6));
        
        
        figuras.add(new Triangulo(0,0,10,4,18));
        figuras.add(new Triangulo(0,0,10,4,18));
        figuras.add(new Triangulo(0,0,10,4,18));
        figuras.add(new Triangulo(0,0,10,4,18));
        figuras.add(new Triangulo(0,0,10,4,18));

        figuras.add(new Paralelepipedo(0,0,4,7,3));
        figuras.add(new Paralelepipedo(0,0,4,7,3));
        figuras.add(new Paralelepipedo(0,0,4,7,3));
        figuras.add(new Paralelepipedo(0,0,4,7,3));
        figuras.add(new Paralelepipedo(0,0,4,7,3));
        
        figuras.add(new Cone(0,0,8,3));
        figuras.add(new Cone(0,0,10,5));
        figuras.add(new Cone(0,0,12,4));
        figuras.add(new Cone(0,0,12,4));
        figuras.add(new Cone(0,0,12,4));
        
        figuras.add(new Cilindro(0,0,5,4));
        figuras.add(new Cilindro(0,0,7,2));
        figuras.add(new Cilindro(0,0,7,2));
        figuras.add(new Cilindro(0,0,7,2));
        figuras.add(new Cilindro(0,0,7,2));
        
        figuras.add(new Equacao(3,0,-9));
        figuras.add(new Equacao(1,0,-9));
        figuras.add(new Equacao(8,3,-83));
        figuras.add(new Equacao(9,0,-30));
        figuras.add(new Equacao(77,1,-2));
        
        salvar("C://Temp/Figuras.dat", figuras);
        carregar("C://Temp/Figuras.dat", figuras);
        
        mostrarFigurasCadastradas();
        opcoesFigura();        
    }

    public boolean salvar (String filename, ArrayList arr) {
        try{
            FileOutputStream fos = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(fos);
            for (int i=0; i < arr.size(); i++) {
                out.writeObject( arr.get(i) );
            }
            out.close();
            fos.close();
        } 
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro salvando objetos... " + ex.getMessage());
            return false;
        }
        return true; 
    }
    
    public boolean carregar (String filename, ArrayList arr) {
        FileInputStream fis;
        ObjectInputStream in;       
        try{
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            arr.clear();
            boolean sair = false; 
            do {                
                try {
                    Object info = in.readObject(); 
                    arr.add(info); 
                }
                catch (EOFException normalEof) { 
                    sair=true;
                }            
            } while (!sair);            
            in.close();
            fis.close();
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
            return false;
        }
        return true;     
    }
    
    private void mostrarFigurasCadastradas() {
        String fig = "";
        for (int i = 0; i < figuras.size(); i++) {
            fig += figuras.get(i).toString() + "\n";
        }
        JTextArea outputArea = new JTextArea(30,40);  //30 linhas e 40 colunas
        outputArea.setText(fig);
        JScrollPane rolagem = new JScrollPane(outputArea);
        JOptionPane.showMessageDialog(null, rolagem, "Dados das figuras cadastradas",
        JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void opcoesFigura(){   
        int menu;
        String fig = "";
        int i = 0;
        do{
            menu = Integer.parseInt( JOptionPane.showInputDialog("Selecione a opção desejada:"
                                        + "\n[1]Ver todos as figuras"
                                        + "\n[2]Ver figura especifica"
                                        + "\n[3]Criar nova figura"
                                        + "\n[4]Sair"));
            switch(menu){
                    case 1:
                    for (i=0; i < figuras.size(); i++){
                    if (figuras.get(i) instanceof Quadrado) {
                    System.out.println(figuras.get(i).toString());
                    }if (figuras.get(i) instanceof Triangulo) {
                    System.out.println(figuras.get(i).toString());
                    }if (figuras.get(i) instanceof Paralelepipedo) {
                    System.out.println(figuras.get(i).toString());
                    }if (figuras.get(i) instanceof Cone) {
                    System.out.println(figuras.get(i).toString());
                    }if (figuras.get(i) instanceof Cilindro) {
                    System.out.println(figuras.get(i).toString());
                    }if (figuras.get(i) instanceof Equacao) {
                    System.out.println(figuras.get(i).toString());
                    }
                }
                break;
                
                case 2:
                String opcao1 = JOptionPane.showInputDialog("Selecione a opção desejada:"
                                                   + "\n[1]QUADRADO"
                                                   + "\n[2]TRIANGULO"
                                                   + "\n[3]PARALELEPIPEDO"
                                                   + "\n[4]CONE"
                                                   + "\n[5]CILINDRO"
                                                   + "\n[6]Equação de 2º grau");
                if("1".equals(opcao1)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Quadrado){
                            System.out.println(figuras.get(i).toString());
                        }   
                    }
                }
                if("2".equals(opcao1)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Triangulo) {
                            System.out.println(figuras.get(i).toString());
                        }   
                    }
                }
                if("3".equals(opcao1)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Paralelepipedo) {
                            System.out.println(figuras.get(i).toString());
                        }   
                    }
                }
                if("4".equals(opcao1)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Cone){
                            System.out.println(figuras.get(i).toString());
                        }   
                    }
                }
                if("5".equals(opcao1)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Cilindro) {
                            System.out.println(figuras.get(i).toString());
                        }   
                    }
                }
                if("6".equals(opcao1)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Equacao) {
                            System.out.println(figuras.get(i).toString());
                        }  
                    }
                }
                break;
                case 3:
                String opcao2 = JOptionPane.showInputDialog("Selecione a opção desejada:"
                                                   + "\n[1]QUADRADO"
                                                   + "\n[2]TRIANGULO"
                                                   + "\n[3]PARALELEPIPEDO"
                                                   + "\n[4]CONE"
                                                   + "\n[5]CILINDRO"
                                                   + "\n[6]Equação de 2º grau");
                if("1".equals(opcao2)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Quadrado){
                            float largura = Float.parseFloat(JOptionPane.showInputDialog("Informe a largura do Quadrado: "));
                            float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do Quadrado: "));
                            Quadrado quad = new Quadrado(0,0,largura,altura);
                            figuras.add(quad);
                            JOptionPane.showMessageDialog(null,quad.toString());
                            salvar("C://Temp/Figuras.dat", figuras);
                            mostrarFigurasCadastradas();
                            break;
                        }   
                    }
                }
                if("2".equals(opcao2)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Triangulo) {
                            float ladoA = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado A do TRIÂNGULO: "));
                            float ladoB = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado B do TRIÂNGULO: "));
                            float ladoC = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado C do TRIÂNGULO: "));
                            Triangulo tri = new Triangulo(0,0,ladoA,ladoB,ladoC);
                            figuras.add(tri);
                            JOptionPane.showMessageDialog(null,tri.toString());
                            salvar("Figuras.dat", figuras);
                            mostrarFigurasCadastradas();
                            break;
                        }   
                    }
                }
                if("3".equals(opcao2)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Paralelepipedo) {
                            float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do PARALELEPIPEDO: "));
                            float comprimento = Float.parseFloat(JOptionPane.showInputDialog("Informe o comprimento do PARALELEPIPEDO: "));
                            float largura = Float.parseFloat(JOptionPane.showInputDialog("Informe a largura do PARALELEPIPEDO: "));
                            Paralelepipedo par = new Paralelepipedo(0,0,altura,comprimento,largura);
                            figuras.add(par);
                            JOptionPane.showMessageDialog(null,par.toString());
                            salvar("Figuras.dat", figuras);
                            mostrarFigurasCadastradas();
                            break;
                        }   
                    }
                }
                if("4".equals(opcao2)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Cone){
                            float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do CONE: "));
                            float raioBase = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio base do CONE: "));
                            Cone con = new Cone(0,0,altura,raioBase);
                            figuras.add(con);
                            JOptionPane.showMessageDialog(null,con.toString());
                            salvar("Figuras.dat", figuras);
                            mostrarFigurasCadastradas();
                            break;
                        }   
                    }
                }
                if("5".equals(opcao2)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Cilindro) {
                            float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do CILINDRO: "));
                            float raioBase = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio base do CILINDRO: "));
                            Cilindro cil = new Cilindro(0,0,altura,raioBase);
                            figuras.add(cil);
                            JOptionPane.showMessageDialog(null,cil.toString());
                            salvar("Figuras.dat", figuras);
                            mostrarFigurasCadastradas();
                            break;
                        }   
                    }
                }
                if("6".equals(opcao2)){
                    for(i=0; i < figuras.size();i++){
                        if (figuras.get(i) instanceof Equacao) {
                            float a = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor A: "));
                            float b = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor B: "));
                            float c = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor C: "));
                            Equacao equa = new Equacao(a,b,c);
                            figuras.add(equa);
                            JOptionPane.showMessageDialog(null,equa.toString());
                            salvar("Figuras.dat", figuras);
                            mostrarFigurasCadastradas();
                            break;
                        }  
                    }
                }
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso "
                            + "programa!");
                    System.exit(0);
               }    
        }while(menu !=9);
    }
}
            

