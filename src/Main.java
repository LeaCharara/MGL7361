import java.time.LocalDate;
import java.util.Calendar;
public class Main {

	public static void main(String[] args) {

		Partenaire Metro = new Partenaire("Metro");
		Metro.addCadeau(new Cadeau("Machine à café", 1500));
		Partenaire IGA = new Partenaire("IGA");
		CatalogueCadeau.addPartenaire(IGA);
		Partenaire Pharmaprix = new Partenaire("Pharmaprix");
		CatalogueCadeau.addPartenaire(Pharmaprix);
		IGA.addCadeau(new Cadeau("Brosse à dent electrique",500));
		IGA.addCadeau(new Cadeau("10 Mascaras",700));
		

		Municipalite Montreal = new Municipalite("Montreal");
		Municipalite Quebec = new Municipalite("Quebec");
		
		Quebec.addAvantage(new Avantage("Offre sur les tickets de bus"));
		Calendar month = Calendar.getInstance();
		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		int lastdate = month.getActualMaximum(Calendar.DATE);
		Client Lea = new Client("Lea", Quebec);
		Lea.getInfo();
		System.out.println("\n");

		Lea.setStatutVUP();
		Lea.getInfo();
		System.out.println("\n");
		System.out.println("-------------Catalogue------------- \n");
		CatalogueCadeau.getAll();
		if (currentDay == lastdate) {
			Lea.getCarte().Bonus();
		}
	}

}
