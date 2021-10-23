import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Partenaire implements IPartenaire{

	private int id;
	private String nom;
	private List<Cadeau> cadeaux=new ArrayList<Cadeau>();
	//public static List<Avantage> listeAvantages=new ArrayList<Avantage>();


	public Partenaire(String nom) {
		super();
		this.id = (int)(Math.random()*10000);
		this.nom = nom;
	}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public List<Cadeau> getCadeaux(){return cadeaux;}

	public void getlisteCadeauxAsString() {
		if(cadeaux.size() == 0){System.out.println("Aucune");}
		else{
			for (int i = 0; i < cadeaux.size(); i++){
				System.out.println(cadeaux.get(i).getNom());
			}
		}
	}	
	public void addCadeau(String nom, double prix) {
		cadeaux.add(new Cadeau(nom, prix)); 
	}	
	
	public void validatePoints(int points, CarteINF carte) {
		carte.removePoints(points);
	}

	public void addPoints(double price, CarteINF carte){
		carte.addPoints(price);
	}
}
