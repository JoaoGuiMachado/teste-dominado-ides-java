package br.com.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
       try (Scanner scan = new Scanner(System.in)) {

        System.out.println("Digite o número: ");
        int fatorial = scan.nextInt();

        double multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for( int i = fatorial; i >= 1; i--) {
           multiplicacao = multiplicacao * i;

        }

        System.out.print(multiplicacao);
        }
    }
}
