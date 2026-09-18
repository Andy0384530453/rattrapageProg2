public class HautVetement extends Vetement {



    private Manche manche;


    public HautVetement(String nom, Taille taille, double prix_Unitaire, String materiel, Manche manche) {
        super(nom, taille, prix_Unitaire, materiel);
        this.manche = manche;
    }


    public Manche getManche() {
        return manche;
    }

    public void setManche(Manche manche) {
        this.manche = manche;
    }




}
