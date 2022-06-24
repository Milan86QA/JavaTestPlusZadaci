import java.util.Scanner;
//Napraviti program gde korisnik unosi visinu petorice kosarkasa
//i program vraca informaciju koji je najvisi, koji je najnizi i koja je prosecna visina
public class zadatak3 {
    public static void main(String[] args) {
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        int najvisi = 0;
        int patuljkovic=Integer.MAX_VALUE;

        int brojac = 1;
        double suma=0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
        System.out.println("Unesite visinu " + brojac + ". kosarkasa: ");
        brojac++;
        int visina = scanner.nextInt();
        if (visina > najvisi){

            najvisi = visina;
        }
            if (visina < patuljkovic){

                patuljkovic = visina;
            }
            suma = suma +visina;
        }
        System.out.println("Najvisi igrac je: " + najvisi);
        System.out.println("Najnizi igrac je: " + patuljkovic);
        double prosek = suma /5;
        System.out.println("Prosek visina svih kosarkasa je: "+ prosek) ;
        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }
}
