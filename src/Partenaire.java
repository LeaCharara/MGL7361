import java.util.HashMap;
import java.lang.Math;

public class Partenaire implements IPartenaire, IGestionAvantage{

	private int id;
	private String nom;
	private HashMap<Integer, Cadeau> cadeaux=new HashMap<Integer, Cadeau>();
	private HashMap<Integer, Avantage> avantages = new HashMap<Integer, Avantage>();


	public Partenaire(String nom) {
		super();
		this.id = (int)(Math.random()*10000);
		this.nom = nom;
	}

	public int getId() {return id;}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public HashMap<Integer, Cadeau> getCadeaux(){return cadeaux;}

	public void getlisteCadeauxAsString() {
		if(cadeaux.size() == 0){System.out.println("Aucune");}
		else{
			for (int i : cadeaux.keySet()){
				System.out.println(cadeaux.get(i).getNom());
			}
		}
	}	
	public void addCadeau(Cadeau cadeau) {
		cadeaux.put(cadeau.getId(), cadeau); 
	}	

	public void removeCadeau(Cadeau cadeau) {
		cadeaux.remove(cadeau.getId());
	}

	public void addAvantage(Avantage avantage) {
		avantages.put(avantage.getId(), avantage);
	}

	public void removeAvantage(Avantage avantage) {
		avantages.remove(avantage.getId());
	}
	
	public void validatePoints(int points, CarteINF carte) {
		carte.removePoints(points);
	}

	public void addPoints(double price, CarteINF carte){
		carte.addPoints(price);
	}
}
