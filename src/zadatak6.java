//Zadatak za vezbu
//Kreirati niz od x brojeva
//Izracunati proizvod parnih brojeva i sumu neparnih brojeva
public class zadatak6 {
    public static void main(String[] args) {
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        int[] niz1 = {10,15,20,25,30,35,40,45};
        System.out.println("Niz1 se sastoji od brojeva:");
        double proizvod = 1;
        int suma = 0;
        for (int i = 0; i < niz1.length; i++) {
            System.out.println( niz1[i]);
            if (niz1[i] %2==0){

                proizvod = proizvod * niz1[i];
            }
            if (niz1[i]%2!=0){
                suma = suma + niz1[i];
            }

        }
        System.out.println("                                        ");
        System.out.println("Proizvod parnih brojeva u nizu1 je: " + proizvod);
        System.out.println("                                        ");
        System.out.println("Suma neparnih brojeva u nizu1 je: " + suma);
        System.out.println("                                        ");
        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }

}