package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author Kevin Kristop Morales Barranco
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {
		//Declaramos un char para nuestra letra perdida
		char perdida = ' ';
		//inicializamos un ciclo for para buscar en nuestro array
		for(int i = 0; i < array.length - 1; i++){
			if((int) array[i+1] - (int) array[i] != 1){
				perdida = (char) ((int) array[i] + 1);
				break;
			}
		}
		return perdida;
	}

}
