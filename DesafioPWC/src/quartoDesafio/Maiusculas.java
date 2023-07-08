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
        Matcher refaz = parametros.matcher(entrada);
        while (refaz.find()) {
        	refaz.appendReplacement(auxiliar, auxiliar.group(1)+ auxiliar.group.toUpperCase());
        	
        }
        refaz.appendTail(auxiliar);
        String resultado = refaz.toString();
        System.out.println(resultado);

    }
}
