public class Cadeau implements Offre{

	public String nom;
	public double prix;
	public String nomPartenaire;
	
	public Cadeau(String nom, double prix,String nomPartenaire) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.nomPartenaire = nomPartenaire;
	}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public double getPrix() {return prix;}
	public void setPrix(double prix) {this.prix = prix;}

	public String getNomPartenaire() {return nomPartenaire;}
	public void setNomPartenaire(String nomPartenaire) {this.nomPartenaire = nomPartenaire;}

	@Override
	public void setPoints() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
