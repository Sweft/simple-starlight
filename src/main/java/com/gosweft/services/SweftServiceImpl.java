package com.gosweft.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
public class SweftServiceImpl implements SweftService{
	
	public int getEditDistance(String string1, String string2) {
		return calculateEditDistance(string1, string1.length(),string2, string2.length());
	}
	
	/*The below method calculates edit distance using recursion.
	  The idea is to process all characters one by one staring from right side of both the strings. 
	  
	  There are two possibilities for every pair of characters being traversed.
	  1)If last characters of the two strings are same - nothing needs to be done. 
	  	Ignore last characters and get count for remaining strings. Thus, we recur for lengths string1Length-1 and string2Length-1.
	  
	  2)Else (If last characters are not same), we consider all operations on ‘string1’. 
	  	Consider all three operations on last character of first string. 
	  	Recursively compute minimum cost for all three operations and take minimum of three values. 
		
		a)Insert: Recur for string1Length and string2Length-1
		b)Remove: Recur for string1Length-1 and string2Length
		c)Replace: Recur for string1Length-1 and string2Length-1 
	 * */
	private int calculateEditDistance(String string1, int string1Length, String string2, int string2Length) {
		// If the first string is empty, the only option is to insert all characters of second string into first
		if (string1Length == 0) {
			return string2Length;
		}
		
		// If the second string is empty, the only option is to insert all characters of second string into first
		if (string2Length == 0) {
			return string1Length;
		}
		
		/*If last characters are not same, consider all three operations on last character of first string and 
		  recursively compute minimum cost for all three operations and take minimum of three values.
		 * */
		if (string1.charAt(string1Length - 1) == string2.charAt(string2Length - 1)) {
			return calculateEditDistance(string1, string1Length - 1, string2, string2Length - 1);
		}
		
		 return 1 + minEditDistance(calculateEditDistance(string1, string1Length, string2, string2Length - 1), 
				 		calculateEditDistance(string1, string1Length - 1, string2, string2Length), 
				 		calculateEditDistance(string1, string1Length - 1, string2, string2Length - 1) 
		              );
	}
	
	private int minEditDistance(int ed1, int ed2, int ed3) {
        if (ed1 <= ed2 && ed1 <= ed3)
            return ed1;
        if (ed2 <= ed1 && ed2 <= ed3)
            return ed2;
        else
            return ed3;
    }
}	