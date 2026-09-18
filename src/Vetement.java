public abstract class Vetement {



    private String nom;
    private Taille taille;
    private double prix_Unitaire;
    private String materiel;


    public Vetement(String nom, Taille taille, double prix_Unitaire, String materiel) {
        this.nom = nom;
        this.taille = taille;
        this.prix_Unitaire = prix_Unitaire;
        this.materiel = materiel;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public double getPrix_Unitaire() {
        return prix_Unitaire;
    }

    public void setPrix_Unitaire(double prix_Unitaire) {
        this.prix_Unitaire = prix_Unitaire;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

}
