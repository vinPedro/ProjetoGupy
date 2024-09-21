package Questao2;

public class VerificadorString {
	
	public static int verificarLetraA(String palavra) {
		int contA = 0;
		String[] entradaStrings = palavra.split("");
		
		for (String a : entradaStrings) {
			if(a.equalsIgnoreCase("A")) {
				contA++;
			}
		}
		
		return contA;
	}

}
