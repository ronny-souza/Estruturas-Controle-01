package exerciciosEstruturaControle;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 04 - Crie um programa que receba um n�mero e informe se ele � um n�mero primo.
 * 
 * */
public class Exercicio04 {

	public static void main(String[] args) {
		
		int contadorDivisores = 0, numero;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero para verificarmos se ele � primo: ");
		numero = keyboard.nextInt();
		
		for(int i = 0; i < numero; i++) {
			
			if(numero % 2 == 0) {
				
				contadorDivisores++;
			}
		}
		
		if(contadorDivisores == 0) {
			
			System.out.println("\nO n�mero " + numero + " � primo!");
		
		}else {
			
			System.out.println("\nO n�mero " + numero + " N�O � primo!");
		}
		
		keyboard.close();
	}

}
