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

	public HashMap<Integer, Avantage> getAvantages() {
		return avantages;
	}	

	//IPARTENAIRE
	public void addCadeau(Cadeau cadeau) {
		cadeaux.put(cadeau.getId(), cadeau); 
	}	

	public void removeCadeau(Cadeau cadeau) {
		cadeaux.remove(cadeau.getId());
	}

	public void addPoints(double price, CarteINF carte){
		ListeOperation.addOperation(new Operation("credit", (int) (price * 0.1), carte, this));
		carte.addPoints(price);
	}
	
	public void validatePoints(Cadeau cadeau, CarteINF carte) {
		if(carte.getPoints() > cadeau.getPrix()){
			carte.removePoints(cadeau.getPrix());
			ListeOperation.addOperation(new Operation("debit", cadeau.getPrix(), carte,this, cadeau));
			System.out.println("Transaction effectuée");
		}
		else{
			System.out.println("Pas assez de points pour valider");		}
	}

	//IGESTION AVANTAGE
	public void addAvantage(Avantage avantage) {
		avantages.put(avantage.getId(), avantage);
	}

	public void removeAvantage(Avantage avantage) {
		avantages.remove(avantage.getId());
	}
	
	//HORS DIAGRAMME DE CLASSE
	public void getlisteCadeauxAsString() {
		if(cadeaux.size() == 0){System.out.println("Aucun");}
		else{
			for (int i : cadeaux.keySet()){
				System.out.println(cadeaux.get(i).getNom() + " | Points: "+cadeaux.get(i).getPrix() + " pts");
			}
		}
	}
	
	public void getlisteAvantagesAsString() {
		if (avantages.size() == 0) {
			System.out.println("Aucun");
		} else {
			for (int i : avantages.keySet()) {
				System.out.println(avantages.get(i).getNom());
			}
		}
	}
}
