public class Personne {

    private String nom;
    private String prenom;
    private boolean hasPermis;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        hasPermis = false;
    }

    public boolean isHasPermis() {
        return hasPermis;
    }

    public void obtenirPermis() {
        hasPermis = true;
    }
    public void suspendrePermis() {
        hasPermis = false;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

}
