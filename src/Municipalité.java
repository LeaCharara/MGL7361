public class Municipalit� {

	private String nom;
	
	
	public Municipalit�(String nom) {
		super();
		this.nom = nom;
	}
	public void createAvantage(String nom) {
		Catalogue.addAvantages(nom,this.nom);
	}
}
