package com.problems.alphabet;

public class Alphabet {

	public static void main(String[] args) {
		
			//reverseChar(" ");
		
		String x = "funky";
		String y = reverseChar(x);
		
		System.out.println(y);
	}
	
	public static String reverseChar(String string) {
		int j = 0;
		string = string.toLowerCase();
		String newString = "";
		char [] alphabet = {'a', 'b',  'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z'};
		
		char [] reverseAlphabet = new char [26];
		
		for( int i = (alphabet.length - 1); i >= 0; i--) {
			
			reverseAlphabet[i] = alphabet[j];			
			j++;
		}
		
		for(int s = 0; s < string.length(); s++) {
			
			for(int i = 0; i < alphabet.length; i++) {
				if(string.charAt(s) == alphabet[i]) {
					newString += reverseAlphabet[i];
				}
			}
			
		}
		
		return newString;
	}

}
