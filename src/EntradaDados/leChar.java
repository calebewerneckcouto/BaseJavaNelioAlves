package EntradaDados;

import java.util.Locale;
import java.util.Scanner;

public class leChar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char x = sc.next().charAt(0);  // Captura o primeiro caractere da entrada
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
