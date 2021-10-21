import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Partenaire {

	private int id;
	private String nom;
	private List<Cadeau> listeCadeaux=new ArrayList<Cadeau>();
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

	public List<Cadeau> getListeCadeaux(){return listeCadeaux;}

	public void getlisteCadeauxAsString() {
		if(listeCadeaux.size() == 0){System.out.println("Aucune");}
		else{
			for (int i = 0; i < listeCadeaux.size(); i++){
				System.out.println(listeCadeaux.get(i).getNom());
			}
		}
	}	
	public void addCadeau(String nom, double prix) {
		listeCadeaux.add(new Cadeau(nom, prix)); 
	}		
}
