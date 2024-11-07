package ProcessamentoJava;

public class Metade {

	public static void main(String[] args) {

		int a, b;
		double resultado;
		double resultadosemcasting;

		a = 5;
		b = 2;

		resultadosemcasting = a / b;

		resultado = (double) a / b;
		
		System.out.println(resultadosemcasting);
		
		System.out.println(resultado);
	}

}
