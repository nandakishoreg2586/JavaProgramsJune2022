package numberPrograms;

public class NumberSplit {
	
	public static void main(String[] args) {
		
		int n = 65975468;
		int m=n;
		
		//Template for all the number related programs
		while(m!=0)
		{
			int d= m%10;
			System.out.println(d);
			m= m/10;
		}
		
		
	}

}
