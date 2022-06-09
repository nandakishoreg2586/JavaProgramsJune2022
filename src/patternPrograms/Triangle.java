package patternPrograms;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Increasing Triangle
		System.out.println("Increasing Triangle");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("Decreasing Triangle");
		//Decreasing Triangle
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		/*Right Sided Triangle 
		 * Left decreasing spaces + Right Increasing stars
		 * 
		 */
		System.out.println("Right Sided Triangle ");
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
		
		
		/*Hill Formation Sided Triangle 
		 * Left decreasing spaces + Right Increasing stars + left increasing stars
		 * 
		 */
		System.out.println("HillTriangle ");
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<i;j++)
				{
					System.out.print("*");
				}
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");
					}
			System.out.println();
		}
		
		
		
		
		
	}

}
