import java.util.Scanner;

public class Exercitiul2 {

    public static int nrvocale(String cuv) {
        int nr = 0;
        for (int i = 0; i < cuv.length(); i++)

            if (cuv.charAt(i) == 'a' || cuv.charAt(i) == 'e' || cuv.charAt(i) == 'i' || cuv.charAt(i) == 'o'
                    || cuv.charAt(i) == 'u' || cuv.charAt(i) == 'A' || cuv.charAt(i) == 'E' || cuv.charAt(i) == 'I'
                    || cuv.charAt(i) == 'O' || cuv.charAt(i) == 'U')
                nr++;

        return nr++;
    }

    public static int numere (String cuvant) {
        int nr = 0;
        for (int k = 0; k < cuvant.length(); k++)

            if (cuvant.charAt(k) >= '0' && cuvant.charAt(k) <= '9')
                nr++;
        return nr;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // Sa se afiseze numarul de vocale pentru fiecare cuvant din fraza

        Scanner sc = new Scanner(System.in);
        String fraza;

        System.out.println("Scrie o fraza: ");
        fraza = sc.nextLine();

        String[] cuvant = fraza.split(" "); // split elimina spatiile dintre cuvinte

        System.out.println("Fraza are: " + cuvant.length + " cuvinte");
        System.out.println("=================");

        System.out.println("Numar vocale pentru fiecare cuvant: ");
        for (int i = 0; i < cuvant.length; i++)
            System.out.println(nrvocale(cuvant[i]));

        // Cate dintre cuvintele frazei sunt numere?

        System.out.println("=================");
        for (int k = 0; k < cuvant.length; k++)
            System.out.println(numere(cuvant[k]));
    }

}
