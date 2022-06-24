import java.util.Scanner;

public class testJava2 {
    /*   Napraviti program koji, koristeci WHILE petlju, racuna proizvod unetih brojeva sve
       dok korisnik ne unese 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");

        int proizvod = 1;
        int i = 1;
        while (i > 0) {
            System.out.println("Unesite broj: ");
            int n = scanner.nextInt();
            proizvod = proizvod * n;
            System.out.println("Proizvod brojeva je: " + proizvod);
            i++;

            if (n == 0){
                System.out.println("                                        ");
                System.out.println("Uneli ste 0! Kraj programa!");
                break;

            }

    }
}}