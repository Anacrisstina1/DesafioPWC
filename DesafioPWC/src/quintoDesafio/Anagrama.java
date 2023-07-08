package quintoDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrama {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        boolean anagramaP = anagramaPalindromo(frase);
        System.out.println(anagramaP);
    }
	
	public static boolean anagramaPalindromo(String input) {
   
        String removerEspaços = input.replaceAll("\\s", "").toLowerCase();

      
        int[] contagem = new int[26];

     
        for (int i = 0; i < removerEspaços.length(); i++) {
            char c = removerEspaços.charAt(i);
            if (c >= 'a' && c <= 'z') {
                contagem[c - 'a']++;
            }
        }

       
        int contagemImp = 0;
        for (int contar : contagem) {
            if (contar % 2 != 0) {
                contagemImp++;
            }
        }

     
        return contagemImp <= 1;
    }

}