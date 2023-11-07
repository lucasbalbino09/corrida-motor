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
