public class Bien {
    private int id;
    private String reference;
    private int prix;
    private String description;
    private double superficie;
    private String adresse;
    // Propriété navigable
    // Representation de la relation many to one qui signifie plusieurs objets de
    // type bien associé a un objet de type proprietaire
    private Proprietaire proprietaire;

    public Bien() {
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public int getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public double getSuperficie() {
        return superficie;
    }

    public String getAdresse() {
        return adresse;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void copy(Bien bien) {
        this.id = bien.getId();
        this.reference = bien.getReference();
        this.prix = bien.getPrix();
        this.adresse = bien.getAdresse();
        this.description = bien.getDescription();
        this.superficie = bien.getSuperficie();
        this.proprietaire = bien.getProprietaire();
    }

    public boolean egal(Bien bien) {
        return this.id == bien.getId();
    }

    public String toChaine() {
        return "ID: " + id +
                "\nRéférence: " + reference +
                "\nPrix: " + prix +
                "\nAdresse: " + adresse +
                "\nDescription: " + description +
                "\nSuperficie: " + superficie +
                "\nPropriétaire:\n\n\n" + proprietaire.toChaine();
    }
}