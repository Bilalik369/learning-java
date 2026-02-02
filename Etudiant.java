import java.util.Scanner;
import java.util.Arrays;

public class Etudiant {

    private int ord;
    private String nom;
    private String prenom;
    private String date;
    private int cne;
    private double[] notes = new double[4];

    public Etudiant() {
        ord = 0;
        nom = "";
        prenom = "";
        date = "";
        cne = 0;
        notes = new double[4];
    }

    public void lecteur() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Order : ");
        ord = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Nom : ");
        nom = sc.nextLine();

        System.out.print("Prenom : ");
        prenom = sc.nextLine();

        System.out.print("CNE : ");
        cne = sc.nextInt();
        sc.nextLine();

        System.out.print("Date : ");
        date = sc.nextLine();

        System.out.println("Saisir 4 notes : ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Note " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }
    }

    public void affichage() {
        System.out.println("Order : " + ord);
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("CNE : " + cne);
        System.out.println("Date : " + date);
        System.out.println("Notes : " + Arrays.toString(notes));
    }

    public boolean valide() {
        double sum = 0;

        for (double note : notes) {
            if (note < 7) {
                return false;
            }
            sum += note;
        }
        return (sum / notes.length) >= 10;
    }
}

