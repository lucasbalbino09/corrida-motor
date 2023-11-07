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
