package ING3;

import java.util.*;

public class Exercice6 {
    private String Mot_de_passe = new String();

    public Exercice6() {
        Random ran = new Random();
        int val = ran.nextInt(90 - 65) + 65;
        this.Mot_de_passe+=(char) val;
        for (int i = 0; i < 2; i++) {
            val = ran.nextInt(122 - 97) + 97;
            this.Mot_de_passe+=(char) val;
        }
        val = ran.nextInt(47 - 33) + 33;
        this.Mot_de_passe+=(char) val;
        for (int i = 0; i < 8; i++) {

            val = ran.nextInt(126);
            this.Mot_de_passe+=(char) val;

        }
        System.out.println(Mot_de_passe);

    }

}
