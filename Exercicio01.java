package exerciciosEstruturaControle;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 01 - Crie um programa que recebe um número e verifica se ele está entre 0 e 10 e é par.
 * 
 * */

public class Exercicio01 {

	public static void main(String[] args) {
	
		int numero;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		numero = keyboard.nextInt();
		
		if((numero >= 0 && numero <= 10) && (numero % 2 == 0)) {
			
				System.out.printf("\nNÚMERO DIGITADO: %d", numero);
				System.out.printf("\nO número está entre 0 e 10 e é par!");
			
		}else {
			
			System.out.println("O número digitado não está entre 0 e 10 e não é par!");
		}
		
		keyboard.close();

	}

}
