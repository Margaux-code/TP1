package ING3;

public class Test {
    public Test(String Exo) {
        Integer result = Integer.valueOf(Exo);
        Boolean bolo = true;
        do {
            switch (result) {
                //Pour choisir quels exos faire :
                case 1:
                    Exercice1 Un = new Exercice1();
                    break;
                case 2:
                System.out.println("Rentrez une suite de notes. (mettez une note negative pour quitter)");
                    Exercice2 deux = new Exercice2();
                    break;
                case 3:
                System.out.println("Numero de lotos aleatoire :");
                    Exercice3 trois = new Exercice3();
                    break;
                case 4:
                System.out.println("Entrez un nombre positif : ");
                    Exercice4 quatre = new Exercice4();
                    break;
                case 6:
                System.out.println("Mot de passe aleatoire");
                    Exercice6 six = new Exercice6();
                    break;
                case 7:
                System.out.println("Rentrer une phrase pour voir si il s'agit d'un palindrome :");
                    Exercice7 sept = new Exercice7();
                    break;
                default:
                    bolo = false;
                    break;
            }

        } while (!bolo);
        // Exercice2 note = new Exercice2();
        // Exercice3 loto = new Exercice3();

    }

    public static void main(String args[]) {
        Test T = new Test(args[0]); //Creation d'un objet pour lancer le menu

    }
}
