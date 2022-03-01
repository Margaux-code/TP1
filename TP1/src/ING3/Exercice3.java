package ING3;
import java.util.*;
import  java.util.Random ;

public class Exercice3 {

    private Vector<Integer> Loto = new Vector<Integer>();
    public Exercice3(){
        int aleatoire;
        Random ran = new Random();
        boolean doublon = true;
        for (int i=0;i<5;i++)
        {
            aleatoire = 1+ran.nextInt(48);
            for (int j=0;j<this.Loto.size();j++)
            {
                if (this.Loto.elementAt(j)==aleatoire)
                {
                    doublon = false;
                }
            }
            if (doublon)
            {this.Loto.add(aleatoire);}
            doublon = true;          
        }
        System.out.println(this.Loto);

    }
    
}
