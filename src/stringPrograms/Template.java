package stringPrograms;

import java.util.StringTokenizer;

public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Tokenizer class
		String s = "Nanda Kishore G 25021986";
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String s1= st.nextToken();
			System.out.println(s1);
		}
		
		System.out.println();
		
		String w="";
		/* To add an space at the end of the sentence as we use the space 
		to differentiate the words
		*/
		
		s += " ";
		 for(int i=0;i<s.length();i++) {
			 char c = s.charAt(i);
			 if(c!=' ')
			 w += c;
			 else
			 {
				 System.out.println(w);
			 	 w="";
			 }	 
		 }
				
		// Reverse a sentense
		
		 for(int i=0;i<s.length();i++) {
			 char c = s.charAt(i);
			 if(c!=' ')
			 w = c + w;
			 else
			 {
				 System.out.println(w);
			 	 w="";
			 }	 
		 }
		 
		 System.out.println();

		 //Code from Merge1 branch To identify a Word in a Sentence
		 for(int i=0;i<s.length();i++)
		 {
			 char c = s.charAt(i);
			 if(c!=' ')
				 w += c;
			 else
			 {
				 System.out.println(w);
				 if(w.contains("Nanda"))
					 System.out.println("Found");
				 w="";
			 }
		 }
		 
		 
		 
		

	}

}
