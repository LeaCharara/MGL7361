import java.text.SimpleDateFormat;
import java.util.*;

//CLASSE AJOUTEE A L'EXTENSION (PARTIE 2)
public class Statistiques {
    
    public static Integer getParticipationsDesClients(Integer pId, Municipalite m){
        Map<Integer, Operation> res = ListeOperation.getOperationsByPartenaireId(pId, m);
        return res.size();
    }

    public static void getCadeauxPopulaires(Integer pId, Municipalite m){
        Map<Integer, Operation> res = ListeOperation.getOperationsByPartenaireId(pId, m);
        HashMap<String, Integer> c = new HashMap<String, Integer>();
        for (Integer op : res.keySet()) {
            if(res.get(op).getCadeau() != null){
                String nom = res.get(op).getCadeau().getNom();
                if(c.containsKey(nom)) {
                    int count = c.get(nom)+1;
                    c.put(nom, count);
                }
                else {
                    c.put(nom, 1);
                }
            }
        }

        LinkedHashMap<String, Integer> ListeDeCadeauPopulaire = new LinkedHashMap<>();
        
        c.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
            .forEachOrdered(x -> ListeDeCadeauPopulaire.put(x.getKey(), x.getValue()));
        for (String i : ListeDeCadeauPopulaire.keySet()){
            System.out.println(i);
        }
    } 

    public static void getAchalandage(Integer pId, Municipalite m){
        Map<Integer, Operation> res = ListeOperation.getOperationsByPartenaireId(pId, m);
        HashMap<String, Integer> heures = new HashMap<String, Integer>();
        for (Integer op : res.keySet()) {
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            String heure = formatter.format(res.get(op).getDate()).split(":")[0];
            if (heures.containsKey(heure)) {
                int count = heures.get(heure) + 1;
                heures.put(heure, count);
            } else {
                heures.put(heure, 1);
            }
        }

        LinkedHashMap<String, Integer> ListeAchalandage = new LinkedHashMap<>();

        heures.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> ListeAchalandage.put(x.getKey(), x.getValue()));
        for (String i : ListeAchalandage.keySet()) {
            System.out.println(i + 'h');
        }
    }

}
