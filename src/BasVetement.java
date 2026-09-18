public class BasVetement extends Vetement{



    private int tourdeTaille;


    public BasVetement(String nom, Taille taille, double prix_Unitaire, String materiel, int tourdeTaille) {
        super(nom, taille, prix_Unitaire, materiel);
        this.tourdeTaille = tourdeTaille;
    }


    public int getTourdeTaille() {
        return tourdeTaille;
    }

    public void setTourdeTaille(int tourdeTaille) {
        this.tourdeTaille = tourdeTaille;
    }

}
