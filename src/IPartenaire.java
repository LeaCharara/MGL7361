import java.util.HashMap;

public interface IPartenaire {
    HashMap<Integer, Cadeau> getCadeaux();
    void addCadeau(Cadeau cadeau);
    //void removeCadeau(int index);
    void addPoints(double price, CarteINF carte);
    void validatePoints(Cadeau cadeau, CarteINF carte);
    
}
