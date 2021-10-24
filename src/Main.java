import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatalogueCadeau catalogue = new CatalogueCadeau();

		Partenaire Metro = new Partenaire("Metro");
		Metro.addCadeau(new Cadeau("Machine à café", 1500));
		Partenaire IGA = new Partenaire("IGA");
		catalogue.addPartenaire(IGA);
		Partenaire Pharmaprix = new Partenaire("Pharmaprix");
		catalogue.addPartenaire(Pharmaprix);
		IGA.addCadeau(new Cadeau("Brosse à dent electrique",500));
		IGA.addCadeau(new Cadeau("10 Mascaras",700));
		

		Municipalite Montreal = new Municipalite("Montreal");
		Municipalite Quebec = new Municipalite("Quebec");
		
		Quebec.addAvantage(new Avantage("Offre sur les tickets de bus"));
		
		Client Lea = new Client("Lea", Quebec);
		Lea.getInfo();
		System.out.println("\n");

		Lea.setStatutVUP();
		Lea.getInfo();
		System.out.println("\n");
		System.out.println("-------------Catalogue-------------");
		catalogue.getAll();
		 
	}

}
