import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bien bien = saisieBien();
        Proprietaire p = saisirProprietaire();
        bien.setProprietaire(p);
        Bien b2 = saisieBien();
        b2.setProprietaire(p);

        afficherBien(bien);
        afficherBien(b2);
    }

    public static Proprietaire saisirProprietaire() {
        System.out.println("Nom: ");
        String nom = sc.nextLine();
        System.out.println("Prénom: ");
        String prenom = sc.nextLine();
        System.out.println("Téléphone: ");
        String telephone = sc.nextLine();

        Proprietaire proprietaire = new Proprietaire(nom, prenom, telephone);
        return proprietaire;
    }

    public static void saisirNProprietaire(int n) {
        for (int i = 0; i < n; i++) {
            saisirProprietaire();
        }
    }

    public static Bien saisieBien() {
        Bien bien = new Bien();
        System.out.println("Id du bien: ");
        bien.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Superficie: ");
        bien.setSuperficie(sc.nextDouble());
        sc.nextLine();

        System.out.println("Adresse: ");
        bien.setAdresse(sc.nextLine());

        System.out.println("Description: ");
        bien.setDescription(sc.nextLine());

        return bien;
    }

    public static void afficherBien(Bien bien) {
        System.out.println(bien.toChaine());
    }

    public static void saisirNBien(int n) {
        Bien bien;
        Bien bienMax = new Bien();
        for (int i = 0; i < n; i++) {
            bien = saisieBien();
            if (bien.getSuperficie() > bienMax.getSuperficie()) {
                bienMax.copy(bien);
            }
        }
        afficherBien(bienMax);
    }
}