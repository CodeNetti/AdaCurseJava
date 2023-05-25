package teste;

import java.util.Arrays;

public class Vetores {
 //Essa é uma forma de declaração de Array e como percorrer ele.
	public static void main(String[] args) {
		int [] numeros = new int[5];
		
		numeros[0] = 8;
		numeros[1] = 9;
		numeros[2] = 1;
		numeros[3] = 2;
		numeros[4] = 3;		

	//	for( int i = 0; i < numeros.length; i++ ) {
	//		
	///		System.out.println(numeros[i]);
			
	//	}
		
		///Está e outra forma de declaração
		String[] letras = {"L","U","L","A"};
		for( int i = 0; i < letras.length; i++ ) {
			
				System.out.println(letras[i]);
		
		

	}
		
		//Outra forma de imprimir Array
		
		System.out.println(Arrays.toString(letras));
		System.out.println(Arrays.toString(numeros));
		
		//maior ou menor e media com array
		
		int [] nota = {10,5,6,4,3};
		int maior = nota  [0];
		int menor = nota  [0];
		int media = 0 ;
		
		for(int x = 0; x < numeros.length; x++ )
		{
			if(numeros[x] > maior) {
				maior = numeros[x];
			}
			if (numeros[x] < menor) 
			{
				menor = numeros[x];
			}
			
			media += numeros[x];
		}
		System.out.println("Maior:" + maior);
		System.out.println("Menor:" + menor);
		System.out.println("Media:" + media/numeros.length);
		
		
		

 }
}
