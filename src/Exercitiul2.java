import java.util.Scanner;

public class Exercitiul2 {

    public static void main(String[] args) {

        //Se dau doua numere. Afisati suma, produsul si media aritmetica a celor doua numere

        Scanner sc = new Scanner(System.in);

        //Suma
        int a, b;
        System.out.println("Da primul numar: ");
        a = sc.nextInt();

        System.out.println("Da al doilea numar: ");
        b = sc.nextInt();

        int s;
        s = a + b;
        System.out.println("Suma este " + s);

        //Produs

        int p;
        p = a * b;

        System.out.println("Produsul este " + p);

        //Media aritmetica

        int ma;

        ma = (a + b) / 2;

        System.out.println("Media aritmetica este " + ma);

    }

}