# corrida-motor

```java

package com.mycompany.carro;

import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {
        
        Scanner stringScanner = new Scanner(System.in);       
        
        Veiculo veic = new Veiculo();        
        
        
        
        System.out.println("informe a placa do carro: ");
        String placa = stringScanner.nextLine();

        System.out.println("informe a marca: ");
        String marca = stringScanner.nextLine();
        
        System.out.println("informe o modelo do carro: ");
        String modelo = stringScanner.nextLine();
        
        System.out.println("Escolha a cor do Carro: ");
        String cor =  stringScanner.nextLine(); 
        
        System.out.println("informe a velocidade: ");
        float velocMax =  stringScanner.nextFloat(); 
        
        System.out.println("informe a quantidade de rodas: ");
        int qtdRodas =  stringScanner.nextInt();
        
        System.out.println("quantidade de pistão: ");
        int qtdPist = stringScanner.nextInt();
        
         System.out.println("quantidade de pistão: ");
        int potencia = stringScanner.nextInt();
        
        System.out.println("");
        
        veic.setPlaca(placa);
        veic.setMarca(marca);
        veic.setModelo(cor);
        veic.setCor(cor);
        veic.setVelocMax(velocMax);
        veic.setQtdRodas(qtdRodas);
        veic.setQtdPist(qtdPist);
        veic.setPotencia(potencia);
        
        
        
        System.out.println(veic.toString());
    }

}

package com.mycompany.carro;

public class Motor {

    private int qtdPist = 0;
    private int potencia = 0;

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Motor() {
    }

    public Motor(int qtd, int potencia) {

        this.qtdPist = qtd;
        this.potencia = potencia;
    }

}

package com.mycompany.carro;

import com.mycompany.carro.Motor;

public class Veiculo extends Motor {

    private String placa = "";
    private String marca = "";
    private String modelo = "";
    private String cor = "";
    private float velocMax = 0;
    private int qtdRodas = 0;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    @Override
    public void setPotencia(int potencia) {
        super.setPotencia(potencia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setQtdPist(int qtdPist) {
        super.setQtdPist(qtdPist); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Veiculo() {

    }

    @Override
    public String toString() {
        return "Veiculo{"
                + "placa= "
                + this.getPlaca()
                + ", marca= "
                + this.getMarca()
                + ", modelo= "
                + getModelo()
                + ", cor= "
                + getCor()
                + ", velocMax= "
                + this.getVelocMax()
                + ", qtdRodas= "
                + getQtdRodas()
                + ", Quantidade de Rodas= "
                + this.getQtdPist()
                + ", potencia do carro= "
                + this.getPotencia()
                + '}';
    }

}


```
