public class Proprietaire {
    private static int compteurId;
    private int id;
    private String nom;
    private String prenom;
    private String telephone;

    public Proprietaire() {
        this.id = ++compteurId;
    }

    public Proprietaire(String nom, String prenom, String telephone) {
        this.id = ++compteurId;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void copy(Proprietaire p) {
        this.nom = p.nom;
        this.prenom = p.prenom;
        this.telephone = p.telephone;
    }

    public boolean egal(Proprietaire p) {
        return this.id == p.id;
    }

    public String toChaine() {
        return "Proprietaire ID: " + id + "\nNom: " + nom + "\nPrenom: " + prenom + "\nTelephone: " + telephone;
    }
}