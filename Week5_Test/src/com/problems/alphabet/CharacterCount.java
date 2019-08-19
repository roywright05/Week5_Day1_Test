package com.problems.alphabet;

public class CharacterCount {

	public static void main(String[] args) {
		

			String shazam = "abracadabra";
			
			g(shazam);

	}
	
	public static void g(String string) {
		
		string = string.toLowerCase();
		char [] alphabet = {'a', 'b',  'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z'};
		int [] count = new int [26];
		
		for(int i = 0; i < string.length(); i++) {
			
			for(int s = 0; s < alphabet.length; s++) {
				
				if(string.charAt(i) == alphabet[s]) {
					
					count[s]++;
				}
				
			}
		}
		
		for(int j = 0; j < alphabet.length; j++) {
			
			if(alphabet[j] == 'z' ) {
				System.out.println(alphabet[j] + ": " + count[j]);
			}else {
				
				System.out.println(alphabet[j] + ": " + count[j] + ",");
			}
		}
	}

}
