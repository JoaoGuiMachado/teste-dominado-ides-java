package br.com.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int quantNumeros;
      
            System.out.println("Quantidade de números: ");
            quantNumeros = scan.nextInt();
      
            int numero;
            int count = 0;
            int quantPares = 0;
            int quantImpares = 0;

            do {
                System.out.println("Digite o número: ");
                numero = scan.nextInt();
                
                if (numero % 2 == 0) quantPares++;
                else quantImpares++;

                count++;
            } while(count < quantNumeros);

            System.out.println("Quantidade de Pares: " + quantPares);
            System.out.println("Quantidade de Ímpares: " + quantImpares);
        }

    }
}
