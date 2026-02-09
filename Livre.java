public class Livre {

    private String titre; 
    private String auteur;
    private int nbPages;
    private int num;

    
    private static int compteur = 0;

    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.num = compteur++;
    }

   
    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.nbPages = 0;
        this.num = compteur++;
    }

    public Livre(Livre e) {
        this.titre = e.titre;
        this.auteur = e.auteur;
        this.nbPages = e.nbPages;
        this.num = compteur++;
    }

    
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public int getNum() {
        return num;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

  
    @Override
    public String toString() {
        return "Livre #" + num +
               " [Titre: " + titre +
               ", Auteur: " + auteur +
               ", Pages: " + nbPages + "]";
    }


    public void afficheToi() {
        System.out.println(this);
    }
}
