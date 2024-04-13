package com.solucionfactible.dev;
//importamos liberias necesarias

import java.util.HashMap;
import java.util.Map;


/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author Kevin Kristop Morales Barranco
 */
public class AreSame {
	
	public static boolean comp(int[] b, int[] a) {
		//primero verificamos que los arrays no vengan vacios
		if (a == null || b == null){
			return false;
		}

		//creamos un contador y le añadimos cada elemento de nuestro array1
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : a){
			countMap.put(num,countMap.getOrDefault(num, 0) + 1);
		}
		//contamos las coincidencias en el array2
		for(int num:b) {
			int squared = num * num;
            if (countMap.containsKey(squared)) {

            }else{
				return false;
			}
            countMap.put(squared,countMap.get(squared) -1);
			if(countMap.get(squared)<0){
				return false;
			}
		}
		return true;
	}

}
