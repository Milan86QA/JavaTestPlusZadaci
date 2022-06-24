/*Napraviti program koji uzme kreiran niz i napravi drugi niz od postojeceg samo sa
  obrnutim redosledom clanova, na primer ako prvi niz ima clanove {1,2,3} onda drugi
  niz treba da ima clanove {3,2,1}*/
public class testJava4 {
    public static void main(String[] args) {
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("                                        ");
        int niz1 [] = {3, 4, 5, 7, 8, 9, 11, 21};
        int niz2 [] = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++){

            niz2[i] = niz1[niz1.length-1-i];
        }
        System.out.println("Obrnuti niz je: ");
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i]);
        }

        System.out.println("                                        ");
        System.out.println("xxxxx -  Kraj programa! - xxxxx");

    }

}
