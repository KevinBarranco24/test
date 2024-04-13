package com.solucionfactible.dev;
//importamos libreria Array
import java.util.Arrays;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author Kevin Kristop Morales Barranco
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
		// Inicializamos un tercer array donde guardaremos los resultados
		int[] result = new int[a.length];
		int index = 0;

		//Declaramos un ciclo for para comparar los dos arrays
		for (int num : a){
			if(!contains(b,num)){
				result[index++] = num;
			}
		}
		return Arrays.copyOf(result, index);
	}
	//declaramos la funcion contains para verificar la existencia de los datos entre los arrays
	private static boolean contains(int[] array, int target){
		for(int num : array){
			if(num == target){
				return true;
			}
		}
		return false;
	}

}
