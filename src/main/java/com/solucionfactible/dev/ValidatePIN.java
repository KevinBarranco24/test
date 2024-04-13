package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author Kevin Kristop Morales Barranco
 */
public class ValidatePIN {
	
	public static boolean isValid(String pin) {
		//primero verificamos que nuestro pin tenga de largo 4 o 6 digitos
		if(pin.length() != 4 && pin.length() != 6){
			return false;
		}

		//despues verificamos que nuestro pin contenga solo digitos
		for(int i=0; i<pin.length(); i++){
			if(!Character.isDigit(pin.charAt(i))){
				return false;
			}
		}
		return true;
	}

}
