import java.util.Scanner; // importation de biblioth�que
public class RegleGraduee 
{
	
	public static void main(String[] args) 
	{
		function2();
	}

	public static void function1()
	{
		System.out.println("Quel doit �tre la longueur de votre r�gle ? (entrez un entier)");
		Scanner scan = new Scanner(System.in);        // Entr�e console nomm�e scan
		int longueur = scan.nextInt();                // Demande de la longueur de la regle
		int i;
		if (longueur < 0)
		{
			System.out.println("La longueur de la r�gle doit �tre un entier positif");
		}
		else
		{
			for (i=0; i<longueur; ++i)                    // utilisation d'ube boucle for : for (start; stop; step)
			{
				System.out.print("-");
			}
		}
	}
	
	
	public static void function2()
	{
		Scanner scan = new Scanner(System.in);        // Entr�e console nomm�e scan
		System.out.println("Quel doit �tre la longueur de votre r�gle ? (entrez un entier)");
		int longueur = scan.nextInt();                // Demande de la longueur de la regle
		System.out.println("Quel doit �tre l'intervalle de graduation de votre r�gle ? (entrez un entier)");
		int intervalle = scan.nextInt();                // Demande de la longueur de la regle
		int i = 0;
		int j;
		if (longueur <= 0)
		{
			System.out.println("La longueur de la r�gle doit �tre un entier positif");
		}
		if (longueur<intervalle)
		{
			System.out.print("|");
			for (i=0; i<longueur; ++i)                    // utilisation d'une boucle for : for (start; stop; step)
			{
				System.out.print("-");
			}
		}
		else
		{
			while (i<longueur)
			{
				System.out.print("|");
				for (j=0; j<intervalle; ++j)              // utilisation d'une boucle for : for (start; stop; step)
				{
					System.out.print("-");
					i++;
					if(i>=longueur)
					{
						break;
					}
				}	
			}
		}
		

	}

}