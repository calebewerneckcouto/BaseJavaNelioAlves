package EntradaDados;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite algo: ");
        String x = sc.nextLine();
        
        System.out.println("Você digitou: " + x);
        
        sc.close();
    }
}
