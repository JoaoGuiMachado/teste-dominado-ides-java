package br.com.loops;

import java.util.Scanner;

public class NomeEIdade {
    
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
        
        String nome;
        int idade; 
        
        while(true) {

        System.out.println("Nome: ");
        nome = scan.next();
        if(nome.equals("0")) break;

        System.out.println("Idade: ");
        scan.nextInt();
        
        }

        System.out.println("Acabou o loop ;)");
        
        }
    }

}
