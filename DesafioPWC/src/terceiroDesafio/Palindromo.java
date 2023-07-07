package terceiroDesafio;

import java.util.Scanner;

public class Palindromo {
   public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   
	   String palavra = entrada.nextLine();
	   String auxiliar = "";
	   
	   for (int x = 0; x < palavra.length(); x++ ){
	   
		   String letra = ""+ palavra.charAt(x);
	   System.out.println(letra);
	   }
}
}
