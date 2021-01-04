package exerciciosEstruturaControle;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 04 - Crie um programa que receba um número e informe se ele é um número primo.
 * 
 * */
public class Exercicio04 {

	public static void main(String[] args) {
		
		int contadorDivisores = 0, numero;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite um número para verificarmos se ele é primo: ");
		numero = keyboard.nextInt();
		
		for(int i = 0; i < numero; i++) {
			
			if(numero % 2 == 0) {
				
				contadorDivisores++;
			}
		}
		
		if(contadorDivisores == 0) {
			
			System.out.println("\nO número " + numero + " é primo!");
		
		}else {
			
			System.out.println("\nO número " + numero + " NÃO é primo!");
		}
		
		keyboard.close();
	}

}
