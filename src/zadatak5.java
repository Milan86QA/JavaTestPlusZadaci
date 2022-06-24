//Kreirati niz od 5 clanova
//Ako su svi clanovi veci od nule onda izracunati proizvod svih clanova
//Ako je barem jedan clan manji ili jednak nuli onda izracunati sumu svih clanova
public class zadatak5 {
    public static void main(String[] args) {
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("                                        ");
        int proizvod = 1;
        int suma =0;
        int [] niz1 = {10, 20, 30, 40, 0};

            if (niz1[0] > 0 && niz1[1] > 0 && niz1[2] > 0 && niz1[3] > 0 && niz1[4] > 0  ) {
                proizvod = niz1[0]*niz1[1]*niz1[2]*niz1[3]*niz1[4];
                System.out.println("Proizvod clanova niza je: " + proizvod);
            }

            if (niz1[0] <= 0 || niz1[1] <= 0 || niz1[2] <= 0 || niz1[3] <= 0 || niz1[4] <= 0  ) {
                suma = niz1[0]+niz1[1]+niz1[2]+niz1[3]+niz1[4];
                System.out.println("Suma clanova niza je: " + suma);
            }
        System.out.println("                                        ");
        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
        }
    }

