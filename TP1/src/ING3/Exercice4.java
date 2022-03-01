package ING3;

import java.util.*;

public class Exercice4 {
    private Vector<Integer> Tableau = new Vector<Integer>();

    public Exercice4() {
        Random ran = new Random();
        Scanner in = null;
        int[] tab = { 0, 0, 0, 0, 0, 0, 0 };
        int  nombre;
        do{
            in = new Scanner(System.in);
        nombre = in.nextInt();

        }while (nombre <=0);
        in.close();
        for (int i = 0; i < nombre; i++) {
           int val = ran.nextInt(6) - 1;
            this.Tableau.add(val);

        }
        Collections.sort(this.Tableau);
        for (int i = 0; i < this.Tableau.size(); i++) {
            switch (this.Tableau.elementAt(i)) {
                case -1:
                    tab[0]++;
                    break;
                case 0:
                    tab[1]++;
                    break;
                case 1:
                    tab[2]++;
                    break;
                case 2:
                    tab[3]++;
                    break;
                case 3:
                    tab[4]++;
                    break;
                case 4:
                    tab[5]++;
                    break;
                case 5:
                    tab[6]++;
                    break;

            }

        }
        System.out.println(Tableau);
        for (int i = 6; i >-1; i--) {
            System.out.print(i - 1 + " : ");
            for (int j = 0; j < tab[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" ");

        }

    }

}
