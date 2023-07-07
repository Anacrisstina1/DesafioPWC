package segundoDesafio;

import java.util.Scanner;

public class Duplicado { 
	public static void main(String[] args) {
		
		Scanner entra = new Scanner (System.in);
		
		String inicial = entra.nextLine();
		
		String auxiliar = ""  ;
		for (int x = 0 ; x < inicial.length(); x++){
			
			String caractere = "" + inicial.charAt(x);
			
			 
		if( auxiliar.indexOf(caractere) == -1) {
			auxiliar += caractere;
			
			System.out.print(caractere);
	
				
			}
		
	}
		
	}

}