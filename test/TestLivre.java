public class TestLivre {

    public static void main(String[] args) {

        Livre L1 = new Livre("L'Étranger", "Albert Camus", 150);
        Livre L2 = new Livre("1984", "George Orwell", 328);

        L1.setNbPages(160);
        L2.setNbPages(350);

        System.out.println("Pages de L1: " + L1.getNbPages());
        System.out.println("Pages de L2: " + L2.getNbPages());

      
        int total = L1.getNbPages() + L2.getNbPages();
        System.out.println("Total des pages: " + total);

        System.out.println("\n--- Test affichage ---");
        L1.afficheToi();

        System.out.println(L2);

        Livre L3 = new Livre(L1);
        System.out.println("\nCopie de L1:");
        System.out.println(L3);
    }
}
