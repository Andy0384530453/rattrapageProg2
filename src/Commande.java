import java.time.LocalDate;
import java.util.List;

public class Commande {



    private String id;
    private LocalDate commandeDate;
    private String description;
    private List<Vetement> vetement;
    private  List<Client> client;


    public Commande(String id, LocalDate commandeDate, String description, List<Vetement> vetement, List<Client> client) {
        this.id = id;
        this.commandeDate = commandeDate;
        this.description = description;
        this.vetement = vetement;
        this.client = client;
    }

    public Commande(List<Commande> commande1) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getCommandeDate() {
        return commandeDate;
    }

    public void setCommandeDate(LocalDate commandeDate) {
        this.commandeDate = commandeDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Vetement> getVetement() {
        return vetement;
    }

    public void setVetement(List<Vetement> vetement) {
        this.vetement = vetement;
    }


    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    public double coutTotal(){
        return vetement.stream()
                .mapToDouble(c->c.getPrix_Unitaire())
                .sum();


    }


}
