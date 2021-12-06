import java.util.HashMap;

public class Municipalite implements IGestionAvantage {

	private int id;
	private String nom;
	private HashMap<Integer, Avantage> avantages;
	public Municipalite(String nom) {
		super();
		this.nom = nom;
		avantages = new HashMap<Integer, Avantage>();
		addAvantage(new Avantage("45 minutes de stationnement gratuit"));
	}
	public void addAvantage(Avantage avantage) {
		avantages.put(avantage.getId(), avantage);
	}

	public void removeAvantage(Avantage avantage){
		avantages.remove(avantage.getId());
	}
	public HashMap<Integer, Avantage> getAvantages() {return avantages;}

	public int getId() {return id;}
	public String getNom() {return nom;}
}
