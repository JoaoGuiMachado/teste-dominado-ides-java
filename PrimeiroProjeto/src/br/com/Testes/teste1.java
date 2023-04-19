package br.com.Testes;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       double i = 0;
       double j = 0;
       double valorTotal = 0;
//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
       if (morangos <= 5){ 
        i = morangos * 2.50;
       }else if(morangos > 5){
        i = morangos * 2.20;
       }

       if (macas <= 5){
        j = macas * 1.80;
       }else if(macas > 5){
        j = macas * 1.50;
       }
       valorTotal = i + j;
        if(valorTotal >= 25 || macas + morangos >= 8){
            double desconto = (valorTotal * (10.0/100));
            valorTotal = valorTotal - desconto;
        }
       System.out.print(valorTotal);
    } 
    
}
