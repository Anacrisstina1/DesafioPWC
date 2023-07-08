package terceiroDesafio;

import java.util.Scanner;

public class Palindromo {
   public static void main(String[] args) {
	   
	   Scanner entrada = new Scanner(System.in);
	   System.out.println("te retornarei a sub palindroma mais longo da string:");
	 //aqui criamos uma String nomeada palavra para usar o Scanner
	   String palavra = entrada.nextLine();
	 //a String auxiliar irá armazenar o palindromo mais longo
	   String auxiliar = "";
	   // vamos percorrer a String duas vezes para identificar e armazenar o palindromo
	    for (int x = 0 ; x < palavra.length(); x++ ){
	    	 for (int y = x+1 ; y < palavra.length(); y++) {
	    		 String substring = palavra.substring(x, y);
	    		 if(palindromo(substring)) {
	    		 if(substring.length()> auxiliar.length()) {
	    			 auxiliar = substring;
	    			
	    		 	}
	    		 }   
	    	 }	    	
	    } 
	    //aqui imprimimos o palindromo mais longo armazenado
	    System.out.print(auxiliar);
   }    
	  //criamos um metodo para identificar se com o passar dos caracteres, se forma um palindromo
   private static boolean palindromo(String palind) {
	        for (int i = 0; i < palind.length(); i++) {
	            if (palind.charAt(i) != palind.charAt(palind.length() - 1 -i )) {
	                return false;
	            }
	        }
	        return true;
}
}
