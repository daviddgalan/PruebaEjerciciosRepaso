import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce un número de 5 cifras");
        String num =s.nextLine();

        if (num.charAt(0) == num.charAt(4) && num.charAt(1) == num.charAt(3)){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }
    }
}
