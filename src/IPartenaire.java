import java.util.List;

public interface IPartenaire {
    List<Cadeau> getListeCadeaux();
    void validatePoints(int points, CarteINF carte);
    void addPoints(double price, CarteINF carte);
}
