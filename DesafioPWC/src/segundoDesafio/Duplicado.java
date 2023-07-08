package segundoDesafio;

import java.util.Scanner;

public class Duplicado { 
	public static void main(String[] args) {
		
		Scanner entra = new Scanner (System.in);
		System.out.println("removerei os caracteres duplicados da sua string:");
		//aqui criamos uma String nomeada iniciar para usar o Scanner
		String inicial = entra.nextLine();
		//a String auxiliar irá armazenar as letras
		String auxiliar = ""  ;
		
			for (int x = 0 ; x < inicial.length(); x++){
				//percorremos as letras para fazer a seleção
				String caractere = "" + inicial.charAt(x);
			
		//aqui fazemos a seleção das letras não-duplicadas para a String auxiliar e após isso, imprimir
		if( auxiliar.indexOf(caractere) == -1) {
			auxiliar += caractere;
			
			System.out.print(caractere);
	
				
			}
		
	}
		
	}

}