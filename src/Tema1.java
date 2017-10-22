public class Tema1
{
    public static void main (String[ ] args)
    {


        int count = 0;
        for (int number = 1; number <= 100; number ++)
        {
            if ((number % 5 == 0))
                count++;
        }
        System.out.println("Numar 5 este divizibil cu " + count + " numere");


    }
}