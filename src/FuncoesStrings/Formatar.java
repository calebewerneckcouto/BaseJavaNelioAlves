package FuncoesStrings;

public class Formatar {

	public static void main(String[] args) {

		/* Maiusculo */
		String palavra = "calebe";
		System.out.println(palavra.toUpperCase());

		/* Minusculo */

		String palavra2 = "CALEBE";
		System.out.println(palavra2.toLowerCase());

		/* Remove espaço */

		String exemplo = " ca csa ";
		System.out.println(exemplo.trim());

		/* Pegar somente segundo caractere */

		String caractere = "cacsa";
		System.out.println(caractere.substring(2));
		System.out.println(caractere.substring(2, 4));

		/* Replace a por x */

		String rep = "cacsa";
		System.out.println(rep.replace('a', 'x'));

		/* indexOf e lastIndexOf */
		String palavras = "csabcs cnascnsa csacnslsna casc";
		int i = palavras.indexOf("csa");
		int j = palavras.lastIndexOf("csa");

		System.out.println(i);
		System.out.println(j);

	}

}
