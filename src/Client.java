import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
public class Client {
    
    private int id;
    private String nom;
    private Boolean statutVUP;
    private List<Avantage> avantages;
    private CarteINF carte;
    private Municipalite municipalite;

    public Client(String n, Municipalite m) {
        id = (int)(Math.random() * 50224520);
        nom = n;
        statutVUP = false;
        avantages = new ArrayList<Avantage>();
        carte = new CarteINF();
        municipalite = m;
    }

    public void setStatutVUP() {
        statutVUP = !statutVUP;
        if(statutVUP){
            avantages = municipalite.getAvantages();
        }
        else {
            avantages = new ArrayList<Avantage>();
        }
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return nom;
    }

    public Boolean getStatutVUP() {
        return statutVUP;
    }

    public List<Avantage> getAvantages() {
        return avantages;
    }

    public CarteINF getCarte() {
        return carte;
    }

    //----------HORS-MODELE-DES-INTERFACES-------------

    public void getInfo() {
        System.out.println("------------Information du client------------");
        System.out.println("Numero de compte: "+ id);
        System.out.println("Nom de l'utilisateur: " + nom);
        System.out.println("Statut VUP: " + statutVUP);
        System.out.println("------------Avantages------------");
        if(listeAvantages.size() > 0){
            for(int i = 0; i < avantages.size(); i++){
                System.out.println(avantages.get(i).getNom());
            }
        }
        else{
            System.out.println("Aucun avantage");
        }
        System.out.println("------------Information de la carte------------");
        carte.getInfo();
    }

}
