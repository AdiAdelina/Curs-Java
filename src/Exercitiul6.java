import java.util.Scanner;

public class Exercitiul6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);


        String cuv;

        cuv = sc.next();

        System.out.println("Cuvantul citit este: " + cuv);

        System.out.println("Primul caracter este: " + cuv.charAt(0)); // sa ne arate prima pozitie a unui sir de caractere/cuvant, prima litera

        System.out.println("Ultimul caracter este: " + cuv.charAt(cuv.length()-1)); //sa ne arate ultima pozitie a unui sir de caractere/cuvant, ultima litera

    }

}
