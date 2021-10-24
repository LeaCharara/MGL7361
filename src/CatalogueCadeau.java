import java.util.HashMap;

public class CatalogueCadeau {

	public HashMap<Integer, Partenaire> listePartenaires = new HashMap<Integer, Partenaire>();
			
	public HashMap<Integer, Partenaire> getPartenaires() {
		return listePartenaires;
	}
	
	public void addPartenaire(Partenaire partenaire) {
		listePartenaires.put(partenaire.getId(), partenaire);
	}

	public void getAll() {
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
