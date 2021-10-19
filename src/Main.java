
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Partenaire Metro = new Partenaire(1,"Metro");
		Metro.createCadeau("Offre sur les bananes",3.5);
		Partenaire IGA = new Partenaire(2,"IGA");
		Partenaire Pharmaprix = new Partenaire(3,"Pharmaprix");
		IGA.createCadeau("Offre sur les fromages",5);
		IGA.createCadeau("Offre sur les jus",4);
		
		Municipalité Montreal = new Municipalité("Montréal");
		Municipalité Quebec = new Municipalité("Québec");
		
		Quebec.createAvantage("Offre sur les tickets de bus");
		
		
		CatalogueCadeau.Allget(); 
	}

}
