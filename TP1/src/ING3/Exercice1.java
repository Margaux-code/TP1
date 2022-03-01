package ING3;
public class Exercice1 {

    public Exercice1() {
        double a = 3.0;
        float b = 4;
        double c;
        for (int i = 0; i < 5; i++)
            System.out.print(i + ", ");
        System.out.print("\n");
        c = Math.sqrt(a * a + b * b);
        System.out.println("c = " + c);

        byte b4 = 42;
        char c1 = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double resultat = (f * b4) + (i / c1) - (d * s);
        System.out.print((f * b4) + " + " + (i / c1) + " - " + (d * s));
        System.out.println(" = " + resultat);
        byte b2 = 10;
        int b3 = b2 * b4;
        System.out.println("b3 = " + b3);
    }
}
