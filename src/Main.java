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
		Cadeau c = new Cadeau("Brosse à dent electrique",100);
		IGA.addCadeau(c);
		Cadeau c2 = new Cadeau("10 Mascaras",700);
		IGA.addCadeau(c2);
		

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

		// Lea.setStatutVUP();
		Lea.getInfo();
		System.out.println("\n");
		System.out.println("-------------Catalogue------------- \n");
		CatalogueCadeau.getAll();
		if (currentDay == lastdate) {
			Lea.getCarte(0).Bonus();
		}
		IGA.addPoints(15000, Lea.getCarte(0));
		IGA.validatePoints(IGA.getCadeaux().get(c.getId()), Lea.getCarte(0));
		IGA.validatePoints(IGA.getCadeaux().get(c.getId()), Lea.getCarte(0));
		IGA.validatePoints(IGA.getCadeaux().get(c2.getId()), Lea.getCarte(0));
		System.out.println("-------------Transactions------------- \n");
		Lea.getOperations();
		// IGA.addPoints(300, Lea.getCarte());
		System.out.println("\n");
		System.out.println("-------------Cadeaux Populaires pour IGA------------- \n");
		Statistiques.getCadeauxPopulaires(IGA.getId(), Quebec);
		System.out.println("\n");
		System.out.println("-------------Heures d'achalandage pour IGA------------- \n");
		Statistiques.getAchalandage(IGA.getId(), Quebec);
		System.out.println("\n");

		Lea.getInfo();
	}

}
