import java.util.Date;
import java.text.SimpleDateFormat;

public class Operation {

    private int id;
    private Date date;
    private String type;
    private Integer points;
    private Integer carteId;
    private Partenaire partenaire;
    private Integer partenaireId;
    private Cadeau cadeau;
    private Municipalite municipalite;

    public Operation(String t, Integer p, CarteINF c, Partenaire part, Cadeau cad){
        id = (int)(Math.random() * 2345678);
        points = p;
        date = new Date();
        type = t;
        carteId = c.getId();
        partenaire = part;
        partenaireId = part.getId();
        cadeau = cad;
        municipalite = c.getMunicipalite();
    }

    public Operation(String t, Integer p, CarteINF c, Partenaire part){
        id = (int) (Math.random() * 2345678);
        points = p;
        date = new Date();
        type = t;
        carteId = c.getId();
        partenaire = part;
        partenaireId = part.getId();
        municipalite = c.getMunicipalite();
    }

    public Integer getCarteId() {
        return carteId;
    }

    public Integer getPartenaireId() { return partenaireId; }

    public Integer getId() { return id;}

    public Municipalite getMunicipalite() {return municipalite;}

    public Cadeau getCadeau() { return cadeau;}

    public Date getDate() {return date;}

    public Integer getPoints() { return points;}

    public void printOperation() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
 
        System.out.println("Date: "+ formatter.format(date));
        System.out.println("Type: "+type);
        System.out.println("Points: "+points);
        System.out.println("Partenaire: " + partenaire.getNom());
        if(cadeau != null)
        {System.out.println("Cadeau: "+ cadeau.getNom());};
    }

}