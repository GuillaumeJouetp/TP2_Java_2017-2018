import java.util.Scanner; // importation de biblioth�que
public class TableMultiplication 
{
	public static void main(String[] args) 
	{
		function1();
	}
	
	public static void function1()
	{
		Scanner scan = new Scanner(System.in); // Entr�e console nomm�e scan
		System.out.println("Quel table de multiplication voulez-vous afficher ?");
		int a = scan.nextInt();
		System.out.println("Jusqu'a combien ?");
		int b = scan.nextInt();
		int k;
		for(k=0;k<b+1;k++)
		{
			System.out.print(a*k + " ");
		}
		

	}
	
	public static void function2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Combien de table de multiplication voulez-vous afficher ?");
		int a = scan.nextInt();
		System.out.println("Jusqu'a combien ?");
		int b = scan.nextInt();
		int i;
		int k;
		for (i=0;i<a+1;i++)
		{	for(k=0;k<b+1;k++)
				{
					System.out.print(i*k + " ");
				}
		System.out.println("");
		}
		
		

	}

}
