import java.util.Scanner;

public class NombrePremiers 
{
	public static void main(String[] args) 
	{
		function1();
	}

	public static void function1()
	{
		Scanner scan = new Scanner(System.in); // Entrée console nommée scan
		System.out.println("Quel nombre voulez-vous tester ?");
		int a = scan.nextInt();
		int k;
		boolean Power = true;
		for(k=2;k<a;k++)
		{
			if(a%k == 0)
			{
				Power = false;
				break;
			}
			
		}
		if(Power == true)
		{
			System.out.println("Votre nombre est un nombre premier");
		}
		else
		{
			System.out.println("Votre nombre n'est pas un nombre premier");
		}
	}
}
