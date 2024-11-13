import java.util.Scanner;

public class ejercicio73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int resultado = 1;

        System.out.print("Dime el primer número: ");
        int x = Integer.parseInt(s.nextLine());

        System.out.print("Dime el segundo número: ");
        int y = Integer.parseInt(s.nextLine());

        for (int i = 0; i < y; i++){
            resultado *= x;
        }
        System.out.println(x + " elevado a " + y + " = " + resultado);
    }
}
