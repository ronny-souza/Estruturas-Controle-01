package exerciciosEstruturaControle;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 03 - Criar um programa que receba duas notas parciais, calcular a média final. 
 * 		Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
 * 		se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
 * 		caso contrário imprime no console "Reprovado".
 * */

public class Exercicio03 {

	public static void main(String[] args) {

			double[] notas = new double[2];
			double media;
			
			Scanner keyboard = new Scanner(System.in);
			
			for (int i = 0; i < notas.length; i++) {
				
				System.out.printf("\nDigite a %dº nota do aluno: ", (i + 1));
				notas[i] = keyboard.nextDouble();
				
			}
			
			media = (notas[0] + notas[1]) / notas.length;
			
			System.out.println("\nMédia: " + media);
			
			if(media >= 7.0 && media <= 10.0) {
				
				System.out.println("Aprovado! Com média " + media);
			
			}else if(media < 7.0 && media > 4.0) {
				
				System.out.println("Recuperação! Com média " + media);
			
			}else {
				
				System.out.println("Reprovado! Com média " + media);
			}
			
			keyboard.close();
	}

}
