import java.util.Scanner;

public class Tema3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Se dau 2 cuvinte. care cuvant este mai lung?

        String nume1, prenume1, nume2, prenume2;

        nume1 = sc.next();
        prenume1 = sc.next();

        if (nume1.equals(prenume1)) {

            System.out.println("Numele + prenumele sunt la fel");
        }

        else {
            System.out.println("Numele + prenumele nu sunt la fel");
        }

        nume2 = sc.next();
        prenume2 = sc.next();

        if (nume2.equals(prenume2)){

            System.out.println("Numele + prenumele sunt la fel");
        }

        else {
            System.out.println("Numele + prenumele nu sunt la fel");
        }



    }
}