package Lesson7;

/**
A palindrome is a string that reads the same forwards and backwards. For
example, noon and madam are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:
The string is a palindrome.
Otherwise, it should print out the message:
The string is not a palindrome.
The application should make use of instantiable classes.
*/


public class Palindrome {
	
	//instance variables
	private String text;
	private String palindromeMess;
	
	//constructor
	public Palindrome(){
		text = "";
		palindromeMess = "";
	}
	//setter
	public void setText(String text) {
		this.text = text;
	}
	//getter
	public String getPalindromeMess() {
		return palindromeMess;
	}
	
	//compute
	public void decideIsPalindrome() {
		StringBuffer sb = new StringBuffer();
		//the number of characters in the string/text
		int len = text.length();
		
		//traverse the text from the end to the beginning(reverse)
		for (int i = len-1; i>= 0; i--) {
			//retrieve one char in each interaction of the loop
			char c = text.charAt(i);
			//add each character to the sb
			sb.append(c);
			
		}
		//convert from a mutable representation back immutable toString method
		String reversedText = sb.toString();
		
		if (text.equalsIgnoreCase(reversedText)) {
			palindromeMess = "The text " + text + " is a Palindrome";
			
		}else {
			palindromeMess = "The text " + text + " is not a Palindrome";
		}//end decideIsPalindrome
				
		
	}

}
