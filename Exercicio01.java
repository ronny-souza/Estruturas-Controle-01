package exerciciosEstruturaControle;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 01 - Crie um programa que recebe um n�mero e verifica se ele est� entre 0 e 10 e � par.
 * 
 * */

public class Exercicio01 {

	public static void main(String[] args) {
	
		int numero;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Digite um n�mero: ");
		numero = keyboard.nextInt();
		
		if((numero >= 0 && numero <= 10) && (numero % 2 == 0)) {
			
				System.out.printf("\nN�MERO DIGITADO: %d", numero);
				System.out.printf("\nO n�mero est� entre 0 e 10 e � par!");
			
		}else {
			
			System.out.println("O n�mero digitado n�o est� entre 0 e 10 e n�o � par!");
		}
		
		keyboard.close();

	}

}
