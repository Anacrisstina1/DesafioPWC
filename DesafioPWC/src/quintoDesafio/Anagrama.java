package quintoDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrama {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("insira aqui a palavra Anagrama palíndroma:");
		
		//aqui criamos uma String nomeada frase para usar o Scanner
        String frase = entrada.nextLine();
        boolean anagramaP = anagramaPalindromo(frase);
        System.out.println(anagramaP);//true
    }
	
	public static boolean anagramaPalindromo(String input) {
   
		//remove os espaços em branco e  transforma em minusculo para auxiliar 
        String removerEspaços = input.replaceAll("\\s", "").toLowerCase();

      //array contando os caracteres usando ASCII
        int[] contagem = new int[26];

     //conta a ocorrencia de cada caractere
        for (int i = 0; i < removerEspaços.length(); i++) {
            char c = removerEspaços.charAt(i);
            if (c >= 'a' && c <= 'z') {
                contagem[c - 'a']++;
            }
        }

       //verifica as contagens impares
        int contagemImp = 0;
        for (int contar : contagem) {
            if (contar % 2 != 0) {
                contagemImp++;
            }
        }

        return contagemImp <= 1;
    }

}