package cours;

public class Persone {
    protected String Nom ;
    protected int id ;

    

    public int getId(){
        return id;
    }
    public String getNom(){
        return Nom;
    }

    public void setId(int id){
     this.id = id;

    }
    public void setNom(String Nom){
        this.Nom = Nom ;
    }
  
   public String toString() {
        return "Persone {" +
               "id = " + id +
               ", nom = '" + Nom + '\'' +
               '}';
    }
}


