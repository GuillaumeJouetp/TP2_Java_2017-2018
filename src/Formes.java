import java.util.Scanner;

public class Formes 
{
	public static void main(String[] args) 
	{
		menu();
	}
	
	public static void menu()
	{
		System.out.println("Quel forme voulez vous tracer ?");
		System.out.println("");
		System.out.println("1.Un rectangle");
		System.out.println("2.Un triangle");
		System.out.println("3.Un triangle inversé");
		Scanner scan = new Scanner(System.in); // Entrée console nommée scan
		int a = scan.nextInt();
		if (a > 3 || a <1 )
		{
			System.out.println("Veuillez entrer un entier compris entre 1 et 3");
		}
		else
		{
			switch (a)
			{
			case 1 :  
			rectangle();
			break;
			case 2 :
			triangleGauche();
			break;
			case 3 :
			triangleDroite();
			break;
		}	}
	}

	public static void rectangle()
	{
		Scanner scan = new Scanner(System.in); // Entrée console nommée scan
		System.out.println("Quelle longueur de coté doit avoir votre rectangle ?");
		int n = scan.nextInt();
		int k;
		int i;
		for(k=1;k<=n;k++)
		{
			for(i=1;i<=n;i++)
			{
				System.out.print("*");
			}
			System.out.println("");	
			
		}
	}
	
	public static void triangleGauche()
	{
		Scanner scan = new Scanner(System.in); // Entrée console nommée scan
		System.out.println("quelle longueur de cotés doit avoir votre triangle ?");
		int n = scan.nextInt();
		int k;
		int i;
		for(k=1;k<=n;k++)
		{
			for(i=1;i<=k;i++)
			{
				System.out.print("*");
			}
			System.out.println("");	
			
		}
	}
	
	public static void triangleDroite()
	{
		Scanner scan = new Scanner(System.in); // Entrée console nommée scan
		System.out.println("Combien de cotés doit avoir votre triangle ?");
		int n = scan.nextInt();
		int k;
		int i;
		int j;
		for(k=n;k>=1;k--)
		{
			for(i=1;i<k;i++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n+1;j++)
			{
				System.out.print("*");
			}	
			
			System.out.println("");	
			
		}
	} 
}
