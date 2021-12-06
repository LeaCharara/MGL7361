import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.Math;
public class Client {
    
    private int id;
    private String nom;
    private List<CarteINF> cartes;

    public Client(String n, Municipalite m) {
        id = (int)(Math.random() * 50224520);
        nom = n;
        cartes = new ArrayList<CarteINF>();
        cartes.add(new CarteINF(m));
    }


    public int getId(){
        return id;
    }

    public String getName(){
        return nom;
    }

    public HashMap<Integer, Avantage> getAvantages(CarteINF c) {
        return c.getAvantages();
    }

    public List<CarteINF> getCartes() {
        return cartes;
    }

    public CarteINF getCarte(int index) {
        return cartes.get(index);
    }

    public void getOperations (){
        for (CarteINF c : cartes){
            ListeOperation.getOperationsByCarteId(c.getId());
        }
    }

    public void getCatalogueCadeau () {
        CatalogueCadeau.getAll();
    }
    //HORS DIAGRAMME DE CLASSE

    public void getInfo() {
        System.out.println("------------Information du client------------");
        System.out.println("Numero de compte: "+ id);
        System.out.println("Nom de l'utilisateur: " + nom);
        
        for (CarteINF carte : cartes){
            System.out.println("------------Information des cartes------------");
            carte.getInfo();
        }
    }

}
