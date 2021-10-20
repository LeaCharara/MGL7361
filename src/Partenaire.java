import java.util.ArrayList;
import java.util.List;

public class Partenaire {

	private int id;
	private String nom;
	//public static List<Cadeau> listeCadeaux=new ArrayList<Cadeau>();
	//public static List<Avantage> listeAvantages=new ArrayList<Avantage>();


	public Partenaire(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		addPartenaire(this);
	}

	private void addPartenaire(Partenaire partenaire) {
		Catalogue.listePartenaires.add(partenaire);
	}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	public void createCadeau(String nom, double prix) {
		Catalogue.addCadeau(nom,prix,this.nom);
	}		
}
