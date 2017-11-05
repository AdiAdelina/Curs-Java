import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String luna;
        int zi;
        int an;

        System.out.println("Introduceti o data " );

        System.out.println("Introduceti ziua ");
        zi=sc.nextInt();

        System.out.println("Introduceti numele complet al lunii" );
        luna=sc.next();

        System.out.println("Introduceti anul de forma yyyy" );
        an=sc.nextInt();

        System.out.println("Data introdusa este: " + zi + luna + an);

        if (an > 9999 && zi > 31 )
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Ianuarie") || luna.equals("ianuarie"))
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Martie") || luna.equals("martie"))
              System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Mai") || luna.equals("mai"))
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Iulie") || luna.equals("iulie"))
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("August") ||luna.equals("august"))
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Octombrie") || luna.equals("octombrie"))
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Decembrie") || luna.equals("decembrie"))
            System.out.println("Data introdusa este valida " + zi +luna+an);

        else if (luna.equals("Februarie") || luna.equals("februarie") && ((an % 4 == 0) && (an % 100 != 0) || (an % 400 == 0)) && zi>29)
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Februarie") || luna.equals("februarie") && ((an % 4 == 0) && (an % 100 != 0) || (an % 400 == 0)) && zi<30)
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Februarie") || luna.equals("februarie") && !((an % 4 == 0) && (an % 100 != 0) || (an % 400 == 0)) && zi>28)
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Februarie") || luna.equals("februarie") && !((an % 4 == 0) && (an % 100 != 0) || (an % 400 == 0)) && zi<29)
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Aprilie") || luna.equals("aprilie") && zi == 31)
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Aprilie") || luna.equals("aprilie") && zi < 31)
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Iunie") || luna.equals("iunie") && zi == 31)
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Iunie") || luna.equals("iunie") && zi < 31)
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Septembrie") || luna.equals("septembrie") && zi == 31)
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Septembrie")  || luna.equals("septembrie") && zi < 31)
            System.out.println("Data introdusa este valida " + zi +luna+an);
        else if (luna.equals("Noiembrie")  || luna.equals("noiembrie") && zi == 31)
            System.out.println("Data introdusa nu este valida");
        else if (luna.equals("Noiembrie") || luna.equals("noiembrie29") && zi < 31)
            System.out.println("Data introdusa este valida " + zi +luna+an);

    }
}
