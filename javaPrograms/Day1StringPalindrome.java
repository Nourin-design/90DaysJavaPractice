package javaPrograms;

public class Day1StringPalindrome {

	public static void main(String[] args) {
		String str = "malayalam";
		int i, len;
		len = str.length();
		
		//Creating an empty string to store the reversed value
		String rev ="";
		for(i=len-1; i>=0; i--)
			rev = rev+str.charAt(i);
		
		if(rev.equals(str))
			System.out.println("Yes, Palindrome! ");
		else
			System.out.println("No, not a palindrome");
		
		//Instead of if else condition can use Ternary operator
		//Condition ? True Statement : False Statement
		System.out.println(rev.equals(str)? "True! it is a Palindrome" :"False! It is not a Palindrome");
		
		/*
		 * String 
		 * StringBuffer strBuf = new StringBuffer(str);
		 * String rev = strBuf.reverse().toString();
		 * if(rev.equals(str))
				System.out.println("Yes, Palindrome! ");
		   else
				System.out.println("No, not a palindrome");
		 */
	}

}
