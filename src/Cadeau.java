import java.lang.Math;
public class Cadeau implements ICadeau{

	private int id;
	public String nom;
	public int prix;
	
	public Cadeau(String nom, int prix) {
		super();
		this.nom = nom;
		this.prix = prix;
		id = (int)(Math.random() * 12345);
	}
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public int getPrix() {return prix;}
	public void setPrix(int prix) {this.prix = prix;}

	public int getId() {return id;}
		
}
