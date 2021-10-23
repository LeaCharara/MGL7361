import java.util.List;
import java.util.ArrayList;
public class Municipalite {

	private String nom;
	private List<Avantage> avantages;
	public Municipalite(String nom) {
		super();
		this.nom = nom;
		avantages = new ArrayList<Avantage>();
	}
	public void createAvantage(String nom) {
		listeAvantages.add(new Avantage(nom));
	}
	//removeAvantage() à ajouter
	public List<Avantage> getAvantages() {return avantages;}

	public String getNom() {return nom;}
}
