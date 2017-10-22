import java.util.Scanner;

public class Exercitiul1 {
/* Se dau doua numere. sa se afiseze numarul mai mare */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Da primul numar: ");
        a = sc.nextInt();

        System.out.println("Numarul introdus este: " + a);

        System.out.println("Da al doilea numar: ");
        b = sc.nextInt();

        System.out.println("Cel de-al doilea numar introdus este: " + b);


        if (a > b)
            System.out.println("Cel mai mare este " + a);

        if (a<b)
            System.out.println("Cel mai mare este " + b);

        if (a == b)
            System.out.println("Cele doua numere sunt egale: " + a + " = " + b);


    }

}