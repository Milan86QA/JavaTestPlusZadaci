import java.util.Scanner;

//Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu. Korisnik
//preko skenera unese koji broj zeli da prebroji u nizu
public class testJava3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        int niz1 []= {22,33, 44, 55, 66, 77, 88, 99, 22, 33, 55, 1, 2, 1, 2, 1, 2};
        int brojac = 0;
        System.out.println("Unesite broj koji proveravate/prebrojavate: ");
        int korisnikovBroj = scanner.nextInt();
        for (int i = 0; i < niz1.length; i++){
            if (korisnikovBroj == niz1[i]){
                brojac++;
            }


        }

        System.out.println("Vas broj se ponovio " + brojac + " puta u nizu.");
        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }
}
