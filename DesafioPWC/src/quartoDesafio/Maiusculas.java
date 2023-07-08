package quartoDesafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maiusculas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
        String frase = entrada.nextLine();
        Pattern parametros = Pattern.compile("(^|\\.\\s+|\\?\\s+|\\!\\s+)([a-z])");
        StringBuilder auxiliar = new StringBuilder();
        
        Matcher refaz = parametros.matcher(frase);
        
        while (refaz.find()) {
        	refaz.appendReplacement(auxiliar, refaz.group(1)+ refaz.group(2).toUpperCase());
        	
        }
        refaz.appendTail(auxiliar);
        String resultado = auxiliar.toString();
        System.out.println(resultado);

    }
}
