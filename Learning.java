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

public class Learning {
  public static void main(String[] args) {

 int[] tab = {1  , 4 , 3 , 44 , 2 ,477};
 
    int max = tab[0];
    int min = tab[0];

    for(int num : tab){
        if(num > max) max = num;
        if(num <min) min = num;
    }
    System.out.println("max " + max);
    System.out.println("min " + min);
    }
}
