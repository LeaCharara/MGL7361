import java.util.HashMap;
public interface IGestionAvantage {
    void addAvantage(Avantage avantage);
    void removeAvantage(Avantage avantage);
    HashMap<Integer, Avantage> getAvantages();
}
