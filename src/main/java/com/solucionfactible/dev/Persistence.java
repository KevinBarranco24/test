package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author Kevin Kristop Morales Barranco
 */
public class Persistence {
	
	public static int persistence(long num) {
		//primero verificamos si el dato ingresado es menor a 10, caso de cumplirlo retornamos 0
		if(num< 10){
			return 0;
		}
		//Declaramos contador en 0
		int count = 0;
		//multiplicamos los digitos de nuestro numero
		int producto = 1;
		while(num > 0){
			int digit = (int)(num % 10);
			producto *= digit;
			num /= 10;
		}
		//si el producto todavia no es un dato de un solo digito llamamos a la funcion recursivamente
		if(producto >= 10){
			count = persistence(producto);
		}
		//incrementamos el contador
		count++;

		return count;
	}

}
