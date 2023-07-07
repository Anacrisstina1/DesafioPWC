package segundoDesafio;

import java.util.Scanner;

public class Duplicado { 
	public static void main(String[] args) {
		Scanner entra = new Scanner (System.in);
		
		StringBuilder paia = new StringBuilder();
		
		String inicial = entra.nextLine();
		
		for (int x = 0 ; x < inicial.length(); x++){
			
			String caractere = "" + inicial.charAt(x);
			System.out.print (caractere+" ");

			 
		if( caractere.indexOf(String.valueOf(caractere))== -1) {
			
			paia.append(caractere);
			
			System.out.print( paia );
			
			return; 
				
			}
		}
	}
}

