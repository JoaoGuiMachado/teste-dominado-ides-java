package br.com.loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    int numero;
    int maior = 0;
    int count = 0;
    int soma = 0;

    do {
        System.out.println("Digite o número: ");
        numero = scan.nextInt();
        count = count + 1;
        soma = soma + numero;
        
        if(numero > maior) maior = numero;

    } while(count < 5);

    System.out.println("Maior: " + maior);
    System.out.println("Média: " + (soma/5));
    
    }
}
