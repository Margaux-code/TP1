package ING3;
import java.util.*;

public class Exercice7 {
   private String dromdrom = "";
public Exercice7(){
    Scanner in = null;
    in = new Scanner(System.in);
   String palindrome= in.next();
   in.close();
   palindrome= palindrome.replace(" ","");
   palindrome= palindrome.toLowerCase();
  
    
   for (int i =palindrome.length()-1 ;i>-1;i--)
   {
       this.dromdrom += palindrome.charAt(i);
   }
   if (this.dromdrom.equals(palindrome))
   {
    System.out.println("Cette phrase est un palindrome");

   }else 
   {System.out.println("Cette phrase n'est pas un palindrome");}

}

}
