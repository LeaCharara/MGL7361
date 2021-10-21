import java.util.List;
import java.util.ArrayList;
public class Municipalite {

	private String nom;
	private List<Avantage> listeAvantages;
	public Municipalite(String nom) {
		super();
		this.nom = nom;
		listeAvantages = new ArrayList<Avantage>();
	}
	public void createAvantage(String nom) {
		listeAvantages.add(new Avantage(nom));
	}

	public String getNom() {return nom;}

	public List<Avantage> getListeAvantages() {return listeAvantages;}
}
