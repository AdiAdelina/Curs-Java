import java.util.*;
import java.text.*;
import java.io.*;

public class Exercitiul1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Se da o fraza (sir de caractere cu spatii)
        // 1. Cate cuvinte sunt in fraza?
        // 2. Afisati primul caracter al fiecarui cuvant din fraza.

        // Rezolvare 1 (Cate cuvinte sunt in fraza?)

        Scanner sc = new Scanner(System.in);
        String fraza;

        System.out.println("Scrie o propozitie: ");
        fraza = sc.nextLine();

        String[] cuv = fraza.split(" "); // split elimina spatiile dintre cuvinte

        if (cuv.length == 1) {
            System.out.println("Fraza are: " + cuv.length + " cuvant"); //Daca fraza are 1 cuvant, afiseaza
        }

        else {
            System.out.println("Fraza are: " + cuv.length + " cuvinte"); //Daca fraza are mai mult de 1 cuvant, afiseaza
        }

        // Rezolvare 2 (Afisati primul caracter al fiecarui cuvant din fraza.)

        System.out.println();
        System.out.println("Prima litera a fiecarui cuvant: ");

        for (int i = 0; i < cuv.length; i++)

            System.out.println(cuv[i].charAt(0));

    }
}