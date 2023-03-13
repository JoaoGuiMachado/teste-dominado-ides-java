package br.com.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		
		Double soma = soma(a,b);
		Double subtracao = subtracao(a,b);
		Double divisao = divisao(a,b);
		Double multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("divisao: " + divisao);
		System.out.println("multiplicacao: " + multiplicacao);
		
	}

	public static double soma(Double a, Double b)	{
		return a + b;
	}
	
	public static Double subtracao(Double a, Double b)	{
		return a - b;
	}
	
	public static Double divisao(Double a, Double b)	{
		return a / b;
	}
	
	public static Double multiplicacao(Double a, Double b)	{
		return a * b;
	}
	
}
