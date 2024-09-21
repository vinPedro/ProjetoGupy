package Questao2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String entrada = inputScanner.nextLine();
		
		System.out.println(VerificadorString.verificarLetraA(entrada));
		
		inputScanner.close();


	}

}
