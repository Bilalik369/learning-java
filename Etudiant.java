import java.util.Scanner;
  import java.util.Arrays;

  
    public class Etudiant {
   
    private int ord;
    private String nom;
    private String prenom;
    private String date;
    private int cne;
    private double[] notes = new double[4];

    public Etudiant(int ord, String nom, String prenom, String date, int cne, double[] notes) {
        this.ord = ord;
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.date = date;
        this.notes = notes.clone(); 
    }

   
    public Etudiant() {
        this.ord = 0;
        this.nom = "";
        this.prenom = "";
        this.cne = 0;
        this.date = "";
        this.notes = new double[4]; 
    }

   
    public Etudiant(Etudiant e) {
        this.ord = e.ord;
        this.nom = e.nom;
        this.prenom = e.prenom;
        this.cne = e.cne;
        this.date = e.date;
        this.notes = e.notes.clone(); 
    }

  
    public int getOrd() {
        return ord;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCne() {
        return cne;
    }

    public String getDate() {
        return date;
    }

    public double[] getNotes() {
        return notes;
    }

    
    public void setOrd(int ord) {
        this.ord = ord;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNotes(double[] notes) {
        this.notes = notes.clone(); 
    }


    public static String clavier(){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        return s;

    }

    public void lecteur(){
         Scanner sc = new Scanner(System.in);

         System.out.println("Order : ");
         ord = sc.nextInt();

         System.out.println("Nom : ");
         nom = sc.next();

         System.out.println("Prenom : ");
         prenom = sc.next();

         System.out.println("CNE : ");
         cne = sc.nextInt();

         System.out.println("Date : ");
         date= sc.nextLine();

         System.out.println("saisire 4 Note : ");
         for(int i = 0 ; i< 4 ; i++){
            System.out.println("Note" + (i + 1) +" : " );
            notes[i] = sc.nextDouble();
         }



    }

    public void affichage(){
    
        System.out.println("Order : " + ord);
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("CNE : " + cne);
        System.out.println("Date : " + date);
        System.out.println("Notes : " + Arrays.toString(notes));
    }

    public boolean valide(){
    
        double sum = 0;

        for(int i = 0 ; i <notes.length; i++){
            if(notes[i] < 7){
                return false;
            }
            sum += notes[i];
        }
        double moyen = sum / notes.length;
        if(moyen >= 10){
            return true;
        }else {
            return false;
        }
    }
}



