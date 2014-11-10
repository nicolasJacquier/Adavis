package rentaco;

/** Classe principale de l'application
 * 
 * @author xilim
 *
 */
public class Rentaco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Rentaco::main()") ;
		
		System.out.println(" [Création du modèle]") ;
		ModeleLocations modele = new ModeleLocations() ;
		
		System.out.println(" [Création du contrôleur]") ;
		Controleur controleur = new Controleur(modele) ;
		
		System.out.println(" [Création de la vue principale]") ;
		new GuiRentaco(modele,controleur) ;
	}

}
