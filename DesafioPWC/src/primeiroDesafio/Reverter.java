package primeiroDesafio;

import java.util.Scanner;

public class Reverter {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("escreva aqui a frase a ser revertida:");
		
		//aqui criamos uma String nomeada fraseNormal para usar o Scanner
		String fraseNormal = entrada.nextLine();
		//para evitar erros, é retirado o espaço do inicio e do fim da frase, se houver
		String trim = fraseNormal.trim();
		//após isso, separamos as palavras em um array onde o quesito de separação é o  espaço entre elas
		String[] separar = fraseNormal.split(" ");
		//percorremos este array
		for (int x = separar.length -1 ; x >= 0; x-- ){
		//assim, usamos o X para identificar o array, a String revertido irá ler o conteúdo que contém no indice e imprimir
			String revertido = separar[x];
			
			System.out.print(revertido + " " );
				
		}
	}

}
