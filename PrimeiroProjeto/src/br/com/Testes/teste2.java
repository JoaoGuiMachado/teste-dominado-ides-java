package br.com.Testes;

import java.io.IOException;
import java.util.Scanner;

public class teste2 {
 
public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    double renda = leitor.nextDouble();
    double imposto;
    double totalPagar = 0;
 
      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
      if(renda <= 2000){
        System.out.println("Isento");
      }else if(renda >= 2000.01 && renda <= 3000.00){
        totalPagar = renda * 0.08;
        System.out.println("R$ " + totalPagar);
      }else if(renda >= 3000.01 && renda <= 4500.00){
        totalPagar = (1000.0 * 0.08) + ((renda - 3000.00) * 0.18);
        System.out.println("R$ " + totalPagar);
      }else if(renda >= 4500.01){
        totalPagar = (2000.00 * 0.18) + ((renda - 4500) * 0.28) - ((renda - 4500.00)/2.0);
        System.out.printf("R$ %.2f %n", totalPagar);
      }
    }
}

