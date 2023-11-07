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
