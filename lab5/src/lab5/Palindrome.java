/**
 * CS 2003 - lab5
 * 
 * 
 *@author Jerry Shafer
 *@since 09/26/2017
 *@version 1.0
 */

package lab5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String input;
		int num = 1;
		
		while(num != 0) {
		
		System.out.println("Enter a string.");

		input = reader.nextLine(); // read input
		input = (input.toLowerCase());
		
		boolean palindrome = isaPalindrome(input);

		if(palindrome)
			System.out.println(input + " is a palindrome.");
		else
			System.out.println(input + " is not a palindrome.");
		
		System.out.println("Enter 0 to quit or any number to enter another string.");
		
		num = Integer.parseInt(reader.nextLine());
		}
		
		reader.close();
	}

	public static boolean isaPalindrome(String input) {
		int length = input.length();
		
		if(input.equals(""))
			return true;
		if(input.charAt(0) == input.charAt(length-1)) {
			if(length == 3)
				return true;
			return isaPalindrome(input.substring(1, (length-1)));
		}
		
		return false;
	}
}
