package ING3;
import java.util.*;

public class Exercice2 {
    private Vector <Integer> Notes = new Vector<Integer>();
    private Integer Increment_min =1;
    private Integer Increment_max =1;
    public Exercice2() {
        
        Scanner in = null;
        int nombre;
         do{
            in = new Scanner(System.in);
             nombre = in.nextInt();
            this.Notes.add(nombre);
        }while (nombre >= 0);
        in.close();
        Integer Dernier = this.Notes.size();
        this.Notes.remove(Dernier);
        System.out.println(this.Notes);
        Collections.sort(this.Notes);
        System.out.println(this.Notes);
        Integer note_max = this.Notes.size();
        int i=1;
        while (this. Notes.elementAt(i)==this.Notes.elementAt(i+1))
        { 
        this.Increment_min ++;
        i++;
        }
        i= note_max -1;
        while (this. Notes.elementAt(i)==this.Notes.elementAt(i-1))
        { 
        this.Increment_max ++;
        i--;
        }

        System.out.println("La note la plus basse est : "+ this.Notes.elementAt(1) +", rencontree "+ this.Increment_min+" fois.");
        System.out.println( "La note la plus haute est : "+ this.Notes.elementAt(note_max-1)+", rencontree "+ this.Increment_max+" fois.");


    }

}
