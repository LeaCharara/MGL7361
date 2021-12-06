import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class CarteINF {
    private int id;
    private int soldePoint;
    private double soldeArgent;
    private int nbUtilisations;
    private Municipalite municipalite;
    private HashMap<Integer, Avantage> avantages;
    private Boolean statutVUP;


    public CarteINF(Municipalite m){
        id = (int)(Math.random() * 1000000);
        soldePoint = 0;
        soldeArgent = 0;
        avantages = new HashMap<Integer, Avantage>();
        nbUtilisations = 0;
        municipalite = m;
        statutVUP = false;
    }

    public void addPoints(double price){
        Map<Integer, Operation> res = ListeOperation.getOperationsInWeek(id);
        int totalPoints = 0;
        for (int i : res.keySet()){
            totalPoints += res.get(i).getPoints();
        }
        if(totalPoints >= 100){
            setStatutVUP();
        }
        soldePoint += (int)price*0.1;
    }

    public void Bonus(){
        soldePoint += nbUtilisations * 10;
    }

    public void removePoints(int points){
        soldePoint -= points;
    }

    public void addMoney(double price){
        soldeArgent += price;
    }

    public void removeMoney(double price) {
        soldeArgent -= price;
    }

    public void addNbUtilisations() {
        nbUtilisations++;
    }

    public int getId(){return id;}
    
    public int getPoints() {
        return soldePoint;
    }

    public double getMoney() {
        return soldeArgent;
    }
    
    public int getNbUtilisations() {
        return nbUtilisations;
    }

    //-------------------METHODES AJOUTES-----------------------//
    
    public void setStatutVUP() {
        statutVUP = !statutVUP;
        if (statutVUP) {
            avantages = municipalite.getAvantages();
        } else {
            avantages = new HashMap<Integer, Avantage>();
        }
    }
    
    public HashMap<Integer, Avantage> getAvantages(){
        return avantages;
    }

    public Municipalite getMunicipalite(){return municipalite;}
    
    public void getOperations(){
        ListeOperation.getOperationsByCarteId(id);
    }

    public Boolean getStatut() { return statutVUP; }

    //----------HORS-MODELE-DES-INTERFACES-------------//
    
    public void getInfo() {
        System.out.println("Numero de la carte: " + id);
        System.out.println("Montant de point : " + soldePoint);
        System.out.println("Argent disponible: " + soldeArgent);
        System.out.println("Municipalité: " + municipalite.getNom());
        System.out.println("Statut VUP: " + statutVUP);
        System.out.println("Nombre d'utilisation: " + nbUtilisations);
        System.out.println("------------Avantages------------");
        if (getAvantages().size() > 0) {
            for (int i : getAvantages().keySet()) {
                System.out.println(getAvantages().get(i).getNom());
            }
        } else {
            System.out.println("Aucun avantage");
        }
    }
}
