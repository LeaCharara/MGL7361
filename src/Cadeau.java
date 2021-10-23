import java.lang.Math;
public class Cadeau implements IOffre{

	public String nom;
	public double prix;
	private int id;
	
	public Cadeau(String nom, double prix) {
		super();
		this.nom = nom;
		this.prix = prix;
		id = (int)(Math.random() * 12345);
	}

	//----------HORS-MODELE-DES-INTERFACES-------------
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public double getPrix() {return prix;}
	public void setPrix(double prix) {this.prix = prix;}

	public int getId() {return id;}

	@Override
	public void setPoints() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
