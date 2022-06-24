import java.util.Scanner;

// Napraviti program u kom korisnik unosi brojeve sve dok ne unese broj 1

public class zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("                                        ");
        int brojac=1;
        int i = 0;
        while (i !=1){
            System.out.print("Unesite " + brojac + ". broj: ");
            int n = scanner.nextInt();
            brojac ++;
            i=n;
        }
        System.out.println("                                        ");
        System.out.println("xxxxx - Uneo si 1! Kraj programa! - xxxxx");

    }
}
