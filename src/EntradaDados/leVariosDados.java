package EntradaDados;

import java.util.Scanner;

public class leVariosDados {

	public static void main(String[] Args) {
		String x;
		int y;
		double z;

		Scanner sc = new Scanner(System.in);
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
