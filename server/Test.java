import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/databese";
        String user = "root"; 
        String password = ""; 

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion avec base de données OK");

            String req = "CREATE TABLE IF NOT EXISTS ETUDIANT (" +
                         "NAPOGEE VARCHAR(8) PRIMARY KEY, " +
                         "PRENOM VARCHAR(20) NOT NULL" +
                        
                         ")";

            Statement st1 = con.createStatement();
            st1.executeUpdate(req);

            st1.close();
            Statement st2 = con.createStatement();
            String req2 = "INSERT INTO ETUDIANT VALUES('12345678' , 'iken');";
            st2.execute(req2);
            st2.close();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}