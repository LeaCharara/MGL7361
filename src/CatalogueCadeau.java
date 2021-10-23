import java.util.HashMap;

public class CatalogueCadeau {

	public static HashMap<Integer, Partenaire> listePartenaires = new HashMap<Integer, Partenaire>();
	// public static List<Cadeau> listeCadeaux=new ArrayList<Cadeau>();
	// public static List<Avantage> listeAvantages=new ArrayList<Avantage>();
	// public static List<Offre> listeOffres = new ArrayList<Offre>();
		
	
	public static HashMap<Integer, Partenaire> getPartenaires() {
		return listePartenaires;
	}
	// public static List<Cadeau> getListeCadeaux() {
	// 	return listeCadeaux;
	// }
	// public static List<Avantage> getListeAvantages() {
	// 	return listeAvantages;
	// }
		
	// public static List<Offre> getListeOffres() {
	// 	return listeOffres;
	// }
	
	public static void addPartenaire(Partenaire partenaire) {
		listePartenaires.put(partenaire.getId(), partenaire);
	}

	// public static void addCadeau(String nom, double prix, String nomPartenaire) {
	// 	Cadeau newCadeau = new Cadeau(nom,prix,nomPartenaire);
	// 	listeCadeaux.add(newCadeau);
	// 	listeOffres.add(newCadeau);
	// }
	// public static void addAvantages(String nom, String nomMunicipalite) {
	// 	Avantage newAvantage = new Avantage(nom,nomMunicipalite);
	// 	listeAvantages.add(newAvantage);
	// 	listeOffres.add(newAvantage);
		
	// }
	public static void getAll() {
		for (int i : listePartenaires.keySet()) {
			System.out.println("Partenaire: " + listePartenaires.get(i).getNom());
			System.out.println("--------Offres Disponible----------");
			listePartenaires.get(i).getlisteCadeauxAsString();
			System.out.println("\n");

		}
		// System.out.println(getListeCadeaux());
		// System.out.println(getListeAvantages());
		// System.out.println(getListeOffres());
		
	}
	
	
	
}
