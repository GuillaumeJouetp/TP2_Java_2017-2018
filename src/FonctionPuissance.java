import java.util.Scanner; // importation de biblioth�que
public class FonctionPuissance 
{

	public static void main(String[] args) 
	{
		function1();
	}
	
	public static void function1() 
	{
		Scanner scan = new Scanner(System.in); // Entr�e console nomm�e scan
		System.out.println("Choississez un nombre entier ");
		int a = scan.nextInt();
		System.out.println("Combien de fois voulez vous multiplier ce nombre par lui m�me ? ");
		int n = scan.nextInt();
		int i;
		int resultat = 1;
		if(n==0)
		{
			System.out.println("Le r�sultat est "+ 1);
		}
		else 
		{
			for (i=1; i<n+1; i++)
			resultat = resultat * a;
		}
		System.out.println("Le r�sultat est "+ resultat);
	}

}
