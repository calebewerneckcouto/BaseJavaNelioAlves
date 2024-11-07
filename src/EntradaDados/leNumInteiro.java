package EntradaDados;

import java.util.Scanner;

public class leNumInteiro {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();
		System.out.println("vc digitou:" + x);

		sc.close();

	}
}
