import java.lang.Math;
;public class Avantage implements IOffre{

	private String nom;
	private int id;

	public Avantage(String nom) {
		super();
		this.nom = nom;
		id = (int)(Math.random() * 5678);
	}

	//----------HORS-MODELE-DES-INTERFACES-------------

	public String getNom() {return nom;} //Remy
	public int getId() {return id;} 
	@Override
	public void setPoints() {
		// TODO Auto-generated method stub
		
	} //Remy
	
}
