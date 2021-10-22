import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
public class Client {
    
    private int id;
    private String nom;
    private Boolean VUP;
    private List<Avantage> listeAvantages;
    private CarteINF carte;
    private Municipalite municipalite;

    public Client(String n, Municipalite m) {
        id = (int)(Math.random() * 50224520);
        nom = n;
        VUP = false;
        listeAvantages = new ArrayList<Avantage>();
        carte = new CarteINF();
        municipalite = m;
    }

    public void setStatus() {
        VUP = !VUP;
        if(VUP){
            listeAvantages = municipalite.getListeAvantages();
        }
        else {
            listeAvantages = new ArrayList<Avantage>();
        }
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return nom;
    }

    public Boolean getStatus() {
        return VUP;
    }

    public List<Avantage> getListeAvantages() {
        return listeAvantages;
    }

    public CarteINF getCarte() {
        return carte;
    }

    public void getInfo() {
        System.out.println("------------Information du client------------");
        System.out.println("Numero de compte: "+ id);
        System.out.println("Nom de l'utilisateur: " + nom);
        System.out.println("Statut VUP: " + VUP);
        System.out.println("------------Avantages------------");
        if(listeAvantages.size() > 0){
            for(int i = 0; i < listeAvantages.size(); i++){
                System.out.println(listeAvantages.get(i).getNom());
            }
        }
        else{
            System.out.println("Aucun avantage");
        }
        System.out.println("------------Information de la carte------------");
        carte.getInfo();
    }

}
