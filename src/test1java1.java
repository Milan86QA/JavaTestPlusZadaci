//Napraviti program koji nalazi najveci broj u nizu i vraca informaciju da li je taj
//najveci broj paran

public class test1java1 {
    public static void main(String[] args) {
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");

        int niz1 [] = {11, 22, 63, 44, 55, 60};
        int najveciBroj = 0;
        for (int i = 0; i < niz1.length; i++){
           if(niz1 [i] > najveciBroj){
               najveciBroj = niz1[i] ;
           }
        }
        System.out.println("Najveci broj u nizu je: " + najveciBroj);
        if (najveciBroj % 2 == 0){
            System.out.println("Najveci broj u nizu je paran!");
        }
        else {
            System.out.println("Najveci broj u nizu nije paran!");
        }

        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }
    }

