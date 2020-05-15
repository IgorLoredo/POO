import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/* Crie uma hierarquia de classes para representar os produtos de uma loja: livros, CDs e DVDs.
 * Um produto é identificado unicamente pelo seu código de barras. Implemente, também,
 * uma classe Loja que permite que sejam armazenados os  produtos e que permita que possam ser adicionados produtos (numa certa quantidade), 
 * possam ser buscados produtos por código de barras ou por nome e possam ser vendidos produtos, dado seu código de barras. É desejável, também, 
 *uma funcionalidade que permita verificar todo o estoque da loja,
 *mostrando o número de itens por produto e por categoria.
 **/

/*
 * produto
 * */
	public class Loja {
		public int EstoqueMax; // estoque maximo por produto
		public int QuanTotalProdutos; // quantidade total de itens na loja
		public int nLivros; //quantidade de cada item 
		public int nDVDs;
		public int nCDs;
		public DVD vetDVD[]; // vetores de cada item
		public CD vetCD[];
		public Livros vetLivros[];
		
		/*public ArrayList<Livros> vetLivros = new ArrayList<Livros>();
		public ArrayList<CD> vetCD = new ArrayList<CD>();
		public ArrayList<DVD> vetDVD = new ArrayList<DVD>(); */
		
		public Loja(int estoqueMax) {
			this.QuanTotalProdutos = 0;
			this.nCDs = 0;
			this.nDVDs = 0;
			this.nLivros = 0;
			this.EstoqueMax = estoqueMax;
			this.vetCD = new CD[estoqueMax];		
			this.vetDVD = new DVD[estoqueMax];
			this.vetLivros = new Livros[estoqueMax];
		}
		
		public Loja() { //DEFAULT  com maximo de 3000 itens 1000 para cada produto
			this.QuanTotalProdutos = 0;
			this.nCDs = 0;
			this.nDVDs = 0;
			this.nLivros = 0;
			this.EstoqueMax = 1000;
			this.vetCD = new CD[1000];		
			this.vetDVD = new DVD[1000];
			this.vetLivros = new Livros[1000];
		}
		
		public static void Menu() {
			System.out.println("\n		Escolha:");
			System.out.println("		1 - Inseri");
			System.out.println("		2 - Procurar");
			System.out.println("		3 - Mostrar estoque");
			System.out.println("		4 - Vender");
			System.out.println("        5 - Sair");
		}
		
		public static void MenuOP() {
			System.out.println("\n		Escolha o Produto:");
			System.out.println("		1 - Livo");
			System.out.println("		2 - DVD");
			System.out.println("		3 - CD");
		
		}
	
		
		
		
	}
	
