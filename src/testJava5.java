/*Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i
tip goriva, a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
Motor trosi 5 litara na 100 km/Automobil trosi 9 litara na 100 km/Kamion trosi 15 litara na 100 km
Tipovi goriva su: Benzin kosta 170 dinara po litru/Dizel kosta 190 dinara po litru
Zadatak raditi kroz switch i pokriti samo happy flow uz default*/

import java.util.Scanner;

public class testJava5 {
    public static void main(String[] args) {

        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("                                        ");
        Scanner scanner = new Scanner(System.in);

        double cena = 1;
        double potrosnjaGoriva = 1;
        System.out.println("Unesite predjenu distancu:");
        int distanca = scanner.nextInt();
        System.out.println("Unesite tip vozila (motor, automobil, kamion) : ");
        String vozilo = scanner.next();
        System.out.println("Unesite tip goriva (benzin, dizel) : ");
        String tipGoriva = scanner.next();
        switch (vozilo){
            case "motor":
                if ( tipGoriva.equals("benzin")) {
                potrosnjaGoriva = distanca / 100 * 5;
                cena = potrosnjaGoriva * 170;

            } else if ( tipGoriva.equals("dizel")) {
                    potrosnjaGoriva = distanca / 100 * 5;

                    cena = potrosnjaGoriva * 190;

                }
                else {
                    System.out.println("Unesite odgovarajuci tip goriva!");
                    break;
            }
            case "automobil":
                if ( tipGoriva.equals("benzin")) {
                    potrosnjaGoriva = distanca / 100 * 9;

                    cena = potrosnjaGoriva * 170;

                } else if ( tipGoriva.equals("dizel")) {
                    potrosnjaGoriva = distanca / 100 * 9;

                    cena = potrosnjaGoriva * 190;

                }
                else {
                    System.out.println("Unesite odgovarajuci tip goriva!");
                    break;
                }
            case "kamion":
                if ( tipGoriva.equals("benzin")) {
                    potrosnjaGoriva = distanca / 100 * 15;

                    cena = potrosnjaGoriva * 170;

                } else if ( tipGoriva.equals("dizel")) {
                    potrosnjaGoriva = distanca / 100 * 15;

                    cena = potrosnjaGoriva * 190;

                }
                else {
                    System.out.println("Unesite odgovarajuci tip goriva!");
                    break;
                }
            default:

                break;
        }
        System.out.println("Potrosili ste " + potrosnjaGoriva + " litara goriva na vasem putovanju!");
        System.out.println("Potrosili ste " + cena + " dinara za gorivo na vasem putovanju!");
        System.out.println("                                        ");
        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }


    }
