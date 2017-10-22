import java.util.Scanner;

public class Exercitiul3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Se dau 3 numere. Care este maximul dintre cele 3.

        Scanner sc = new Scanner(System.in);


        int a, b, c, max = 0;
        System.out.println("Da primul numar: ");
        a = sc.nextInt();

        System.out.println("Da al doilea numar: ");
        b = sc.nextInt();

        System.out.println("Da al treilea numar: ");
        c = sc.nextInt();

        if (a > b && a > c)
            max = a;

        if (b> a && b > c)
            max = b;

        if (c > a && c > b)
            max = c;
        System.out.println("Numarul maxim este: " + max);

    }

}