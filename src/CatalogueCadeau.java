import java.util.HashMap;

public class CatalogueCadeau {

	public static HashMap<Integer, Partenaire> partenaires = new HashMap<Integer, Partenaire>();
			
	public static HashMap<Integer, Partenaire> getPartenaires() {
		return partenaires;
	}
	
	public static void addPartenaire(Partenaire partenaire) {
		partenaires.put(partenaire.getId(), partenaire);
	}

	public static void getAll() {
		for (int i : partenaires.keySet()) {
			System.out.println("Partenaire: " + partenaires.get(i).getNom());
			System.out.println("--------Cadeaux Disponible----------");
			partenaires.get(i).getlisteCadeauxAsString();
			System.out.println("--------Avantages Disponible----------");
			partenaires.get(i).getlisteAvantagesAsString();
			System.out.println("\n");

		}
		
	}
	
	
	
}
