//Napraviti program koji prikazuje brojeve deljive sa 3 izmedju broja n i m
//i koliko ima tih brojeva
import java.util.Scanner;
public class zadatak1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("Unesite prvi broj: ");
        int n = scanner.nextInt();
        System.out.println("Unesite drugi broj: ");
        int m = scanner.nextInt();
        int brojac = 0;

        for (int i = n; i < m; i++){
            if (i %3==0){
                System.out.println("Brojevi deljivi sa 3 su: " + i);
                brojac++;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Broj brojeva deljivih sa 3 je: " + brojac);

        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }
}
