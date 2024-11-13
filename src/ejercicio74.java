import java.util.Scanner;

public class ejercicio74 {
    public static void main(String[] args) {
        int password = 1234;
        int passwordUser;
        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("Inserte la contraseña de la caja fuerte (4 dígitos):");
            passwordUser = sc.nextInt();

            if (passwordUser != password){
                i++;
                System.out.println("Lo siento, esa no es la combinación");
            } else if (passwordUser == password) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            }
        } while (passwordUser != password && i < 4);






    }
}
