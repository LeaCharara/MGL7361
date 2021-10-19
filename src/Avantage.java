public class Avantage implements Offre{

	private String nom;
	public String nomMunicipalite;

	public Avantage(String nom,String nomMunicipalite) {
		super();
		this.nom = nom;
		this.nomMunicipalite = nomMunicipalite;
	}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;} 
	
}
