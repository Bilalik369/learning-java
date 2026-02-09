public class Livre {
    private String titre ; 
    private String auteur ;
    private int nbPages ;
    private int Num ;

    private static int compteur = 0;


    public Livre(String titre , String auteur ,int nbPages , int Num  ){
        this.titre = titre;
        this.auteur = auteur ;
        this.nbPages = nbPages;
        this.Num = compteur++;

    }

    public Livre(){
        this.titre = "";
        this.auteur = "";
        this.nbPages = 0;
        this.Num = compteur++;
    }
    public Livre(Livre e){
        this.titre = e.titre ;
        this.auteur = e.auteur;
        this.nbPages = e.nbPages;
        this.Num = compteur++;
    }

    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public int getNbPage(){
        return nbPages;
    }
    public int getNum(){
        return Num;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public void setNbPage(int nbPages){
        this.nbPages = nbPages;
    }

    public String toString(){
        return "Livre #" + Num + " [Titre: " + titre + ", Auteur: " + auteur + ", Pages: " + nbPages + "]";
    }
    public void afficheToi(){
        System.out.println(this.toString());
    }

  
}
