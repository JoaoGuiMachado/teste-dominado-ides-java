package br.com.Testes;

import java.util.Arrays;
import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
       
        Character arrVogais [] = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
        var vogais = Arrays.asList(arrVogais);
       
        for (String item : strSplit) {
   
      //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
     //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
        
            var letras = item.toCharArray();
            for(char x : letras){
                if(vogais.contains(Character.toLowerCase(x)))
                quantVogais++;
            }
       
       }
       System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
