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

public class Learning {
    public static void main(String[] args) {
        
        System.out.println("Nombres d'Armstrong supérieurs à 100 :");

        for (int n = 100; n <= 999; n++) {

            int temp = n;
            int somme = 0;

            while (temp != 0) {
                int chiffre = temp % 10;
                somme += chiffre * chiffre * chiffre;
                temp = temp / 10;
            }

            if (somme == n) {
                System.out.println(n);
            }
        }
    }
}
