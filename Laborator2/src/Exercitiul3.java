import java.util.Scanner;

public class Exercitiul3 {

    // Cate dintre cuvintele frazei sunt numere?

    public static int numere(String cuvant) {
        int ok = 1;
        for (int j = 0; j < cuvant.length(); j++)

            if (cuvant.charAt(j) < '0' || cuvant.charAt(j) > '9') {
                ok = 0;
                break;
            }

        return ok;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraza;

        System.out.println("Scrie o fraza: ");
        fraza = sc.nextLine();

        String[] cuv = fraza.split(" "); // split elimina spatiile dintre cuvinte

        // System.out.println("Fraza are: " + cuv.length + " cuvinte");
        //
        // System.out.println("");

        int count = 0;

        for (int i = 0; i < cuv.length; i++) {
            if (numere(cuv[i]) == 1)
                count++;
        }
        if (count == 1)
        {
            System.out.println("Propozitia contine: " + count + " numar");
        }

        else {


            System.out.println("Propozitia contine: " + count + " numere");
        }
    }

}
