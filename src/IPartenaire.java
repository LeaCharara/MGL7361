import java.util.List;

public interface IPartenaire {
    List<Cadeau> getCadeaux();
    void addCadeau(Cadeau cadeau);
    //void removeCadeau(int index);
    void addPoints(double price, CarteINF carte);
    void validatePoints(int points, CarteINF carte);
    
}
