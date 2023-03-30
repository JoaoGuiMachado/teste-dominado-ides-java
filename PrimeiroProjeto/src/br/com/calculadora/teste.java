package br.com.calculadora;

import java.io.IOException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double soma = 0;
        double numero;
        //TODO: Implemente as condições adequadas para obter a quantidade 
       //de valores positivos e a média dos valores positivos:
           for (int i = cont ; i < 6 ; i++) {
               numero = leitor.nextDouble();
               
               if(numero >= 0){
               cont++;
               soma = soma + numero;
               }
   
          }
           
           media = soma/cont;
           System.out.println(cont + " valores positivos");
           System.out.println(String.format("%.1f", media));
       }
}
