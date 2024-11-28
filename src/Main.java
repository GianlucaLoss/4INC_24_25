public class Main {
    public static void main(String[] args) {
        Personaggio p1 = new Personaggio("Carlo", 148);
        Personaggio p2 = new Medico("Andrea", 207, "Radiologo");
        Personaggio p3 = new Insegnante("Marco", 28, "Italiano e Storia");
        Personaggio p4 = new MedicoOspedaliero("Laura", 65, "Pediatra", "San Maurizio");
        Medico m1 = new MedicoOspedaliero("Gianluca", 25, "Odontoiatra", "Santa Chiara");

        System.out.println("\n" + p1.toString());
        System.out.println("\n" + p1.partecipa("Minuti"));

        System.out.println("\n" + p2.toString());
        System.out.println("\n" + p2.partecipa("Minuti"));

        System.out.println("\n" + p3.toString());
        System.out.println("\n" + p3.partecipa("Minuti"));

        System.out.println("\n" + p4.toString());
        System.out.println("\n" + p1.partecipa("Minuti"));

        System.out.println("\n" + m1.toString());
        System.out.println("\n" + m1.partecipa());
    }
}