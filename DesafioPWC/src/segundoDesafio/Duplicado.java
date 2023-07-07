package segundoDesafio;

import java.util.Scanner;

public class Duplicado { 
	public static void main(String[] args) {
		Scanner entra = new Scanner (System.in);
		
		String inicial = entra.nextLine();
		//String [] arr = inicial.split(" ");
		
		for (int x = 0 ; x < inicial.length(); x++){
			
			char caractere = inicial.charAt(x);
			System.out.print (caractere+" ");
			
		}
	}

}
