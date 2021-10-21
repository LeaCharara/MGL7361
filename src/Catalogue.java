import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	public static List<Partenaire> listePartenaires=new ArrayList<Partenaire>();
	public static List<Cadeau> listeCadeaux=new ArrayList<Cadeau>();
	public static List<Avantage> listeAvantages=new ArrayList<Avantage>();
	public static List<Offre> listeOffres = new ArrayList<Offre>();
		
	
	public static List<Partenaire> getListePartenaires() {
		return listePartenaires;
	}
	public static List<Cadeau> getListeCadeaux() {
		return listeCadeaux;
	}
	public static List<Avantage> getListeAvantages() {
		return listeAvantages;
	}
		
	public static List<Offre> getListeOffres() {
		return listeOffres;
	}
	
	public static void addCadeau(String nom, double prix) {
		Cadeau newCadeau = new Cadeau(nom,prix);
		listeCadeaux.add(newCadeau);
	}
	public static void addAvantages(String nom, String nomMunicipalite) {
		Avantage newAvantage = new Avantage(nom);
		listeAvantages.add(newAvantage);
		listeOffres.add(newAvantage);
		
	}
	public static void Allget() {
		List<Partenaire> p = getListePartenaires();
		for (int i = 0; i < p.size(); ++i) {
			System.out.println("Patenaire: " + p.get(i).getNom());
			System.out.println(listeCadeaux.size());
			for(int j = 0; j < listeCadeaux.size(); ++j) {
				System.out.println("Cadeaux nº"+j+": "+ listeCadeaux.get(j).getNom());
			}
		}
		
	}
	
	
	
}
