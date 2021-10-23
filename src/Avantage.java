public class Avantage implements IOffre{

	private String nom;

	public Avantage(String nom) {
		super();
		this.nom = nom;
	}

	//----------HORS-MODELE-DES-INTERFACES-------------

	public String getNom() {return nom;} //Remy

	@Override
	public void setPoints() {
		// TODO Auto-generated method stub
		
	} //Remy
	
}
