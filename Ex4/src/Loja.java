import java.util.ArrayList;

/* Crie uma hierarquia de classes para representar os produtos de uma loja: livros, CDs e DVDs.
 * Um produto � identificado unicamente pelo seu c�digo de barras. Implemente, tamb�m,
 * uma classe Loja que permite que sejam armazenados os  produtos e que permita que possam ser adicionados produtos (numa certa quantidade), 
 * possam ser buscados produtos por c�digo de barras ou por nome e possam ser vendidos produtos, dado seu c�digo de barras. � desej�vel, tamb�m, 
 *uma funcionalidade que permita verificar todo o estoque da loja,
 *mostrando o n�mero de itens por produto e por categoria.
 **/

/*
 * produto
 * */
	public class Loja {
		public int nLivros;
		public int nDVDs;
		public int nCDs;
		public ArrayList<Livros> vetLivros = new ArrayList<Livros>();
		public ArrayList<CD> vetCD = new ArrayList<CD>();
		public ArrayList<DVD> vetDVD = new ArrayList<DVD>();
		
		public static void Menu() {
			System.out.println("\n		Escolha:");
			System.out.println("		1 - Inseri");
			System.out.println("		2 - Procurar");
			System.out.println("		3 - Mostrar estoque");
			System.out.println("		4 - Vender");
			System.out.println("        5 - Sair");
		}
	}
	
