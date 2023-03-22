package br.com.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;

            System.out.println("Digite a nota: ");
            nota = scan.nextInt();

            while(nota < 0 || nota > 10) {
                System.out.println("nota inválida! Digite novamente: ");
                nota = scan.nextInt();
            }
        }
    }
}
