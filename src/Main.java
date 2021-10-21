import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatalogueCadeau catalogue = new CatalogueCadeau();

		Partenaire Metro = new Partenaire("Metro");
		Metro.addCadeau("Offre sur les bananes",3.5);
		Partenaire IGA = new Partenaire("IGA");
		catalogue.addPartenaire(IGA);
		Partenaire Pharmaprix = new Partenaire("Pharmaprix");
		catalogue.addPartenaire(Pharmaprix);
		IGA.addCadeau("Offre sur les fromages",5);
		IGA.addCadeau("Offre sur les jus",4);
		

		Municipalite Montreal = new Municipalite("Montreal");
		Municipalite Quebec = new Municipalite("Quebec");
		
		Quebec.createAvantage("Offre sur les tickets de bus");
		
		Client Lea = new Client("Lea");
		Lea.getInfo();
		System.out.println("\n");

		Lea.setStatus(Quebec);
		Lea.getInfo();
		System.out.println("\n");
		System.out.println("-------------Catalogue-------------");
		catalogue.Allget();
		 
	}

}
