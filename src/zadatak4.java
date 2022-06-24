import java.util.Scanner;
//Napisati program gde korisnik unosi username i password
//ako tri puta pogresno unese onda ga program izbacuje
//Username je: "username"
//Password je: "password"
public class zadatak4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬Pocetak programa¬¬¬¬¬¬¬¬¬¬¬¬");
        for (int i=0; i<3; i++){
            System.out.println("Unesite username: ");
            String username = scanner.next();
            System.out.println("Unesite password: ");
            String password = scanner.next();

            if (username.equals("username") && password.equals("password")){
                System.out.println("Uneli ste ispravne podatke! Login uspesan");
                break;
            }
            else {
                System.out.println("Uneli ste lose podatke! Login neuspesan!");
            }
        }
        System.out.println("xxxxx -  Kraj programa!  - xxxxx");
    }
}
