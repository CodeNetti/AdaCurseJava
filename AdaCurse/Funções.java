package teste;

import java.util.Scanner;

public class Funções {

	public static void main(String[] args) {
		 Scanner scaner = new Scanner(System.in);
				 System.out.println("Qual é o seu nome>");
				 String nome = scaner.nextLine();
				 
				 	saudacao(nome);
		
         scaner.close();
	}
	
	public static void saudacao(String nome )
	{
		System.out.println("Hello " + nome);
	}

}
