import java.util.Scanner;

public class ejercicio70 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduce un numero");
        String numero=s.nextLine();
        for(int i=0;i<=numero.length()-1;i++){
            System.out.print(numero.charAt(i)+" ");

        }
    }
}
