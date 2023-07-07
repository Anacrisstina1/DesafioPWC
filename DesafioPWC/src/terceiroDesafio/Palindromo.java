package terceiroDesafio;

import java.util.Scanner;

public class Palindromo {
   public static void main(String[] args) {
	   
	   Scanner entrada = new Scanner(System.in);
	   
	   String palavra = entrada.nextLine();
	   
	   String auxiliar = "";
	   
	    for (int x = 0; x < palavra.length(); x++ ){
	    	 for (int y = x+1 ; y < palavra.length(); y++) {
	    		 String substring = palavra.substring(x, y);
	    		 if(palindromo(substring) && substring.length()> auxiliar.length()) {
	    			 auxiliar = substring;
	    			  System.out.print(auxiliar);
	    		 }
	    	 } 
	    }
	   
   }    
	  
private static boolean palindromo(String palind) {
	        for (int i = 0; i < palind.length() / 2; i++) {
	            if (palind.charAt(i) != palind.charAt(palind.length() - 1 )) {
	                return false;
	            }
	        }
	        return true;
}
}
