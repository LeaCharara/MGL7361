public class Municipalité {

	private String nom;
	
	
	public Municipalité(String nom) {
		super();
		this.nom = nom;
	}
	public void createAvantage(String nom) {
		CatalogueCadeau.addAvantages(nom,this.nom);
	}
}
