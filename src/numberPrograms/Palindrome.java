package numberPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization 
		int n = 112111;
		int m =n, sum = 0;
		
		//Logic
		while(n!=0)
		{
			int d=n%10;
			sum = sum*10+d;
			n=n/10;		
		}
		
		//Condition
		if(sum==m)
			System.out.println("Paliandrome");
		else
			System.out.println("Not a Palindrome");
		
		

	}

}
