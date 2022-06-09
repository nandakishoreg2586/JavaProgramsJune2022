package charPrograms;

public class CharacterPrograms {
	
	
	public static void main(String[] args) {
		
	String s = "Nanda Kishore G 25021986";
	
	//Print Upper and Lower case characters separately
	for(int i =0;i<s.length();i++)
	{
		char c = s.charAt(i);
		if(Character.isUpperCase(c))
			System.out.print(c);
	}
	
	System.out.println();
	
	// To print all the digits in the characters
	for(int i =0;i<s.length();i++)
	{
		char c = s.charAt(i);
		if(Character.isDigit(c))
			System.out.print(c);
	}
	
	System.out.println();
	
	// To print all the Upper and Lower case characters count 
	int countU=0,countL=0;
	
	for(int i=0;i<s.length();i++) 
	{
		char c = s.charAt(i);
		if(Character.isUpperCase(c))
			countU++;
		if(Character.isLowerCase(c))
			countL++;
	}
	System.out.printf("Upper char count: "+countU);
	System.out.println();
	System.out.printf("Lower char count :"+ countL);
	
	System.out.println();
	
	// To count a specific alphabet
	int charCountU=0;
	
	for(int i=0;i<s.length();i++) 
	{
		char c = s.charAt(i);
		char c1= Character.toUpperCase(c);
		if(c1=='I')
			charCountU++;
	}
	System.out.printf("Specific char count: "+charCountU);
	
	
	System.out.println();
	
	//To create a new string only with upper case characters
	String newString="";
	
	for(int i=0;i<s.length();i++) 
	{
		char c = s.charAt(i);
		if(Character.isUpperCase(c))
			newString = newString + c;
	}
	System.out.println("New String : "+newString);
	
		
	//To remove spaces in a sentence
	String newString1="";

	for(int i=0;i<s.length();i++) 
	{
		char c = s.charAt(i);
		if(!Character.isWhitespace(c))
			newString1 = newString1 + c;
	}
	System.out.println("New String : "+newString1);
	
	
	//Reverse
	String reverseString="";

	for(int i=0;i<s.length();i++) 
	{
		char c = s.charAt(i);
			reverseString = c+reverseString;
	}
	System.out.println("New String : "+reverseString);
	
	//Paliandrome with the help of reverse strings
	if(reverseString.equalsIgnoreCase(s))
		System.out.println("Palindrome");
	else
		System.out.println("Not a Palindrome");

}

}
