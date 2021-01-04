package exerciciosEstruturaControle;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int ano, bissexto;
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Digite o ano: ");
		ano = keyboard.nextInt();

		bissexto = ano % 4;

		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		
		keyboard.close();

	}

}
