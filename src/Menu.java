/* <!>  Ce code doit etre exécuté seulement si les fichiers suivants sont présent dans le meme dossier que Menu.java : 
 -RegleGraduee.java
 -FonctionPuissance.java
 -TableMultiplication.java
 -NombrePremiers.java
 -Formes.java
 - <!> */

import java.util.Scanner; // importation de bibliothèque
public class Menu 
{

	public static void main(String[] args) 
	{
		System.out.println("Quel exercice ?");
		System.out.println("");
		System.out.println(" 1.Regle");
		System.out.println(" 2.Puissance");
		System.out.println(" 3.Multiplication");
		System.out.println(" 4.Nombres premiers");
		System.out.println(" 5.Formes");
		
		Scanner scan = new Scanner(System.in); // Entrée console nommée scan
		int a = scan.nextInt();                // Demande du numero d'exercice
			if (a > 5 || a <1 )
			{
				System.out.println("Veuillez entrer un entier compris entre 1 et 5");
			}
			else
			{
				switch (a)
				{
				case 1 :  
				System.out.println("Bienvenue dans l'exercice 1.Regle");
				RegleGraduee.function2();
				break;
				case 2 :
				System.out.println("Bienvenue dans l'exercice 2.Puissance");
				FonctionPuissance.function1();
				break;
				case 3 :
				System.out.println("Bienvenue dans l'exercice 3.Multiplication");
				TableMultiplication.function2();
				break;
				case 4 :
				System.out.println("Bienvenue dans l'exercice 4.Nombres premiers");
				NombrePremiers.function1();
				break;
				case 5 :
				System.out.println("Bienvenue dans l'exercice 5.Formes");
				Formes.menu();
				break;
				}
			}
	}
	
	

}
