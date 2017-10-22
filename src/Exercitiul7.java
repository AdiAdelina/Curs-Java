import java.util.Scanner;

public class Exercitiul7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
// numara de cate ori apare un caracter / o litera intr-un cuvant
        Scanner sc = new Scanner(System.in);

        String cuv;

        cuv = sc.next();

        System.out.println("Cuvantul citit este: " + cuv);

        int count = 0;

        for(int i = 0; i < cuv.length(); i++)

            if (cuv.charAt(i) == 'a' || cuv.charAt(i) == 'A')

                count = count + 1;

        System.out.println("Cuvantul " + cuv + " contine " + count + " de a");

    }

}


