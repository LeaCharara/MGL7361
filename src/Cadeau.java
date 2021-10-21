public class Cadeau implements Offre{

	public String nom;
	public double prix;
	
	public Cadeau(String nom, double prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public double getPrix() {return prix;}
	public void setPrix(double prix) {this.prix = prix;}

	@Override
	public void setPoints() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
