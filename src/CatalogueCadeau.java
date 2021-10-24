import java.util.HashMap;

public class CatalogueCadeau {

	public static HashMap<Integer, Partenaire> listePartenaires = new HashMap<Integer, Partenaire>();
			
	public static HashMap<Integer, Partenaire> getPartenaires() {
		return listePartenaires;
	}
	
	public static void addPartenaire(Partenaire partenaire) {
		listePartenaires.put(partenaire.getId(), partenaire);
	}

	public static void getAll() {
		for (int i : listePartenaires.keySet()) {
			System.out.println("Partenaire: " + listePartenaires.get(i).getNom());
			System.out.println("--------Cadeaux Disponible----------");
			listePartenaires.get(i).getlisteCadeauxAsString();
			System.out.println("--------Avantages Disponible----------");
			listePartenaires.get(i).getlisteAvantagesAsString();
			System.out.println("\n");

		}
		
	}
	
	
	
}
