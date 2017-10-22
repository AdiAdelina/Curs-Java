import java.util.Scanner;

public class Exercitiul5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Se dau 2 cuvinte. care cuvant este mai lung?

        String cuv1;

        cuv1 = sc.next();

        System.out.println("Cuvantul citit este: " + cuv1);

        String cuv2;

        cuv2 = sc.next();

        System.out.println("Cuvantul citit este: " + cuv2);

        if (cuv1.length() > cuv2.length())

            System.out.println("Cel mai lung cuvant este: " + cuv1);


        else

            System.out.println("Cel mai lung cuvant este: " + cuv2);
    }
}