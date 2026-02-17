// public class Learning {
//   public static void main(String[] args) {
//         if (args.length > 0) {
//          System.out.println("Salam " + args[0] + "!");
//         } else {
//             System.out.println("Salam! ");
//         }
//     }
// }

// public class Learning {

//     public static void main(String[] args){
//         int age = 12;
//         String name = "Ahmed";
//         char grade = 'A';
//         boolean minor = true;
//         double taile = 1.77;

//         System.out.println(age);
//         System.out.println(name);
//         System.out.println(grade);
//         System.out.println(minor);
//         System.out.println(taile);

//     }
// }


// public class Learning {
//   public static void main(String[] args) {

//     int age  = Integer.parseInt(args[0]);

//     System.out.println("entre votre age" + age);
//     if(age >= 18){
//         System.out.println("agee");
//     }else{
//         System.out.println("minore");
//     }

//     }
// }


// public class Learning {
//   public static void main(String[] args) {

//     int[] tab = {1 , 2 , 3 ,4};
//     int sum = 0;
//     for(int i = 0 ; i<tab.length ; i++){
//         sum = sum + tab[i];
//     }
//     System.out.println(sum);
       
//     }
// }

// public class Learning {
//   public static void main(String[] args) {

//  int[] tab = {1  , 4 , 3 , 44 , 2 ,477};
 
//     int max = tab[0];
//     int min = tab[0];

//     for(int num : tab){
//         if(num > max) max = num;
//         if(num <min) min = num;
//     }
//     System.out.println("max " + max);
//     System.out.println("min " + min);
//     }
// }


// public class Learning {
//   public static void main(String[] args) {

//     int[] tab = {1  , 4 , 3 , 44 , 23 ,2};
//     int sum = 0;
//     for(int num : tab){
//      sum += num;
//     }

//     double avrg = (double) sum / tab.length;
//       System.out.println("moyen "  + avrg); 
//     }
    
// }

// public class Learning {
//   public static void main(String[] args) {
//     int [] tab = {1 , 2 , 3 , 33, 2 ,9};
   
//     int indexRemove = 2;

//     int[] newTab = new int[tab.length - 1];
    
//     for(int i = 0 , j = 0;i< tab.length ; i++){
//         if(i!= indexRemove){
//             newTab[j++] = tab[i];
//         }
        
//     }
//     for(int num : newTab){
//         System.out.println(num);
//     }

    

//     }
// }
// public class Learning {
//   public static void main(String[] args) {
//     int [] tab = {1 , 2 , 3 , 33, 2 ,9};

//     int search = 91;
//     boolean found = false;

//     for(int num : tab){
//         if(num == search){
//             found = true;
//             break;  
//         }
//     }
//     if(found){
//         System.out.println("elmen trouve");
//     }else{
//         System.out.println("elemn non trouve");
//     }
//    //hell
    

//     }
// }

// public class Learning {
//   public static void main(String[] args) {
//     int [] tab = {1 , 2 , 3 , 33, 2 ,9};

//     for(int i = tab.length -1 ; i>=0; i--){
//         System.out.println(tab[i]);
//     }

    

//     }
// }


// public class Learning {
//   public static void main(String[] args) {
//     int [] tab = {1 , 2 , 3 , 33, 2 ,9};

//     int min = tab[0];
//     int max = tab[0];

//     for( int num : tab){
//         if(num > max) max = num;
//         if(num <min) min = num ;
//     }

//     System.out.println("max :" + max);
//     System.out.println("min :" + min);

    

//     }
// }


// public class Learning {
//   public static void main(String[] args) {
//     int [] tab = {1 , 2 , 3 , 33, 2 ,9};
//     int count = 0;
    
 
//     for(int num : tab){
//         if(num % 2 ==0){
//             count++;
//         }
//     }

//     System.out.println("nbr des nbr pair :" + count);



    

//     }
// }

import java.util.Scanner;


// public class Learning {
//   public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);

//    System.out.println("entre votre premier nbr");

//    int a = sc.nextInt();
//    System.out.println("entr votre deuxiem nbr");
//    int b = sc.nextInt();
//    if(a == 0 || b == 0) {
//     System.out.println("produit et 0");
//    }else if (a > 0 || b > 0 && a <0 || b<0){
//     System.out.println("les signe de produit et positive ");
//    }else if( a > 0 || b <0 && a<0 || b >0){
//     System.out.println("le produitet negative");
//    }

//     }
// }

// import java.util.Scanner;
// public class Learning {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("entre le premier nbr ");

//         int a = sc.nextInt();

//         System.out.println("entre le deuxieme nbr ");

//         int b = sc.nextInt();

//         System.out.println("entre le troisuem nbr ");

//         int c = sc.nextInt();

//         if(a > b &&  a > c){
//             System.out.println("le grand valeur" + a);
//         }else if(b > a && b > c){
//             System.out.println("le grand valeur /"+ b);
//         }else if(c > a && c > b){
//             System.out.println("le grand valeur : " + c);
//         }
            
//         }

//     }



import java.util.Scanner;


// public class Learning {
//   public static void main(String[] args) {
//    String maChaine = "Une premier phrase. Et voici une deuxiem.";

//    char[] arr = maChaine.toCharArray();

//    int nbr = arr.length;

//    System.out.println(nbr);
//     }
// }


// public class Learning {
//     public static void main(String[] args) {

//         String maChaine = "Une premier phrase. Et voici une deuxiem.";

//         char[] arr = maChaine.toCharArray();

//         int count = 0;

//         for (char c : arr) {
//             if (Character.isLetter(c)) {  
//                 count++;
//             }
//         }

//         System.out.println("Nombre de lettres : " + count);
//     }
// }

import java.util.Scanner;

// public class Learning {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Entrez le numéro du mois (de 1 à 12) : ");
//         int mois = sc.nextInt();

//         if (mois == 1 || mois == 3 || mois == 5 || mois == 7 ||
//             mois == 8 || mois == 10 || mois == 12) {

//             System.out.println("Nombre de jours : 31");

//         } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {

//             System.out.println("Nombre de jours : 30");

//         } else if (mois == 2) {

//             System.out.println("Nombre de jours : 28");

//         } else {

//             System.out.println("Erreur : numéro du mois invalide !");
//         }

        
//     }
// }

// public class Learning {
//     public static void main(String[] args) {
        
//         System.out.println("Nombres d'Armstrong supérieurs à 100 :");

//         for (int n = 100; n <= 999; n++) {

//             int temp = n;
//             int somme = 0;

//             while (temp != 0) {
//                 int chiffre = temp % 10;
//                 somme += chiffre * chiffre * chiffre;
//                 temp = temp / 10;
//             }

//             if (somme == n) {
//                 System.out.println(n);
//             }
//         }
//     }
// }


// public class Learning {
//     public static void main(String[] args) {
        

//         System.out.println("ebre votre nbr");

//         for(int n = 100 ; n <999 ; n++){
//             int temp = n;
//             int sum = 0;

//             while (temp != 0) {
//                 int chiffre = temp % 10;
//                 sum += chiffre * chiffre * chiffre;
//                 temp = temp / 10 ;
  
//             }

//             if(sum == n){
//                 System.err.println(n);
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class Learning {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n;
//         int sum = 0;
//         int[] t = new int[50];

//         do {
//             System.out.println("Entrez la dimension du tableau (1 à 50):");
//             n = sc.nextInt();
//         } while (n < 1 || n > 50);

//         for (int i = 0; i < n; i++) {
//             System.out.print("tab[" + i + "] = ");
//             t[i] = sc.nextInt();
//             sum += t[i];
//         }

//         System.out.println("Contenu du tableau:");
//         for (int i = 0; i < n; i++) {
//             System.out.println("tab[" + i + "] = " + t[i]);
//         }

//         for(int i = 0 ; i< n - 1 ;i ++){
//             for(int j = i + 1 ; j < n ; j++){
//                 if(t[i] > t[j]){
//                     int temp = t[i];
//                     t[i] = t[j];
//                     t[j]= temp;

//                 }
//             }

//         }

//         System.out.println("le table apre le tri");
//         for(int i = 0 ; i < n ; i ++){
//             System.out.println(t[i]);
//         }

//         System.out.println("la somme :" + sum);

//         sc.close();
//     }
// }
 

// public class Learning {
//     public static void main(String[] args){
//         class Persson  {
//         private int age ;
//         protected String name; 
//         public String city ;
            
//         }

//         class Student extends Persson {
//             void test(){
                
//                 System.out.println(name);
//                 System.out.println(city);
                
//             }
//         }

//     }
// }

// class Point {
//     private float x;
//     private float y;

    
//     public Point(float x, float y) {
//         this.x = x;
//         this.y = y;
//     }

    
//     public Point(float a) {
//         this.x = a;
//         this.y = a;
//     }

    
//     public Point() {
//         this.x = 0;
//         this.y = 0;
//     }

 
//     public void changerX(float a) {
//         this.x = a;
//     }
//     public float retournerX(){
//         return x;
//     }
//     public Point (Point P){
//         this.x = P.x;
//         this.y = P.y;
//     }
// }

// public class Learning {
//     public static void main(String[] args) {
//     //    Point p1 = new Point();
//     //    Point p2 =p1;
//     //    p2.changerX(4);

//     //    System.out.println(p2.retournerX());

//     Point p1 = new Point(3 , 4);
//     Point p2 = new Point(p1);
//     p2.changerX(10);
//     System.out.println(p1.retournerX());



//     }
// }

// import java.util.Scanner;
// class Employe {
//     private int num ;
//     private String nom;
//     private String prenom ;
//     private double salire ;
//     private String date ;

//     public Employe (int num , String nom , String prenom , double salire , String date){
//         this.num = num;
//         this.nom = nom;
//         this.prenom= prenom;
//         this.salire = salire ;
//         this.date = date ;


//     }
//     public Employe (){
//         this.num = 0;
//         this.nom = "";
//         this.prenom = "";
//         this.salire = 0;
//         this.date = "";

//     }

//     public Employe (Employe e){

//         this.num = e.num;
//         this.nom = e.nom;
//         this.prenom = e.prenom;
//         this.salire = e.salire;
//         this.date = e.date;
//     }

//     public int getNum () {
//         return num ;
//     }

//     public String getNom() {
//         return nom ;
//     }
//     public String getPrenom(){
//         return prenom;
//     }
//     public double getSalaire() {
//         return salire;
//     }
//     public String getDate(){
//         return date;
//     }

//     public void setNum(int num) {
//         this.num = num;
//     }
//      public void setNom (String nom) {
//         this.nom = nom ;
//      }
//      public void setPrenom(String prenom ){
//         this.prenom = prenom ; 
//      }
//      public void setSalaire(double salire){
//         this.salire = salire;
//      }
//      public void setDate(String date){
//         this.date = date;

//      }


//      public void lecteur(){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Num :");
//     num = sc.nextInt();
//     sc.nextLine(); 

//     System.out.println("Nom :");
//     nom = sc.nextLine();

//     System.out.println("Prenom :");
//     prenom = sc.nextLine();

//     System.out.println("Salaire :");
//     salire = sc.nextDouble();
//     sc.nextLine(); 

//     System.out.println("Date :");
//     date = sc.nextLine();
// }

//      public void affichage(){
//         System.out.println("Num :" + num);
//         System.out.println("Nom :" + nom);
//         System.out.println("prenom :" + prenom);
//         System.out.println("Salaire :" + salire);
//         System.out.println("Date :" + date);
//      }



// }


// public class Learning{
//  public static void main(String[] args){
//     Employe e1 = new Employe();
//     e1.lecteur();
//     e1.affichage();
//  }
// }


public class Learning {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant();

        e1.lecteur();
        e1.affichage();

        if (e1.valide()) {
            System.out.println("L'etudiant a validé le semestre");
        } else {
            System.out.println("L'etudiant n'a pas validé le semestre");
        }
    }
}


