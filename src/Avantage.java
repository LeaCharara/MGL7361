import java.lang.Math;
public class Avantage {

	private String nom;
	private int id;

	public Avantage(String nom) {
		super();
		this.nom = nom;
		id = (int)(Math.random() * 5678);
	}

	public String getNom() {return nom;} //Remy
	public int getId() {return id;} 
	
}
