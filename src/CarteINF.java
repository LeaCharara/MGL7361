import java.util.List;
import java.lang.Math;

public class CarteINF {
    private int id;
    private int soldePoint;
    private double soldeArgent;
    private int nbUtilisations;

    public CarteINF(){
        id = (int)(Math.random() * 1000000);
        soldePoint = 0;
        soldeArgent = 0;
        nbUtilisations = 0;
    }

    public void addPoints(double price){
        soldePoint += (int)price*0.1;
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

    //----------HORS-MODELE-DES-INTERFACES-------------
    
    public void getInfo() {
        System.out.println("Numero de la carte: " + id);
        System.out.println("Montant de point : " + soldePoint);
        System.out.println("Argent disponible: " + soldeArgent);
        System.out.println("Nombre d'utilisation: " + nbUtilisations);
    }
}
