package quartoDesafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maiusculas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("escreva sua frase em letras minusculas:");
		 //aqui criamos uma String nomeada frase para usar o Scanner
        String frase = entrada.nextLine();
        // criado o pattern para identificar a simbologia onde se termina as frases
        Pattern parametros = Pattern.compile("(^|\\.\\s+|\\?\\s+|\\!\\s+)([a-z])");
        // o StringBuilder auxiliar irá armazenar a nova String com as substituições
        StringBuilder auxiliar = new StringBuilder();
        Matcher refaz = parametros.matcher(frase);
        
        // aqui será substituida a primeira letra por ela maiúscula
        while (refaz.find()) {
        	refaz.appendReplacement(auxiliar, refaz.group(1)+ refaz.group(2).toUpperCase());
        	
        }
        //add o  restante do texto ao StringBuilder
        refaz.appendTail(auxiliar);
        //obtem uma nova String com as letras maiusculas
        String resultado = auxiliar.toString();
        System.out.println(resultado);

    }
}
