package primeiroDesafio;

import java.util.Scanner;

public class Reverter {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String fraseNormal = entrada.nextLine();
		String trim = fraseNormal.trim();
		String[] separar = fraseNormal.split(" ");
		
		for (int x = separar.length -1 ; x >= 0; x-- ){
			
			String teste = separar[x];
			System.out.print(teste + " " );
				
		
		
		}
	}

}
