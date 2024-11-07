package EntradaDados;

import java.util.Locale;
import java.util.Scanner;

public class leNumPontoFlutuante {
	
	


		public static void main(String[] Args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			double x;
			x = sc.nextDouble();
			System.out.println("vc digitou:" + x);

			sc.close();

		}
	}



