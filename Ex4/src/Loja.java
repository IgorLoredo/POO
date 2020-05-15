//igor guilherme pereira loredo 11275071

import java.io.IOException;

/* Crie uma hierarquia de classes para representar os produtos de uma loja: livros, CDs e DVDs.
 * Um produto é identificado unicamente pelo seu código de barras. Implemente, também,
 * uma classe Loja que permite que sejam armazenados os  produtos e que permita que possam ser adicionados produtos (numa certa quantidade), 
 * possam ser buscados produtos por código de barras ou por nome e possam ser vendidos produtos, dado seu código de barras. É desejável, também, 
 *uma funcionalidade que permita verificar todo o estoque da loja,
 *mostrando o número de itens por produto e por categoria.
 *
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
		
		
		public Loja(int estoqueMax) { // caso queria começar com um certo estoque
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
			System.out.println("		5 - Sair");
		}
		
		public static void MenuOP() {
			System.out.println("\n		Escolha o Produto:");
			System.out.println("		1 - Livro");
			System.out.println("		2 - DVD");
			System.out.println("		3 - CD");
		
		}
	
		public void estoque() { // estoque completo
			String r;
			System.out.println("	Numero de livros :" + this.nLivros); // printar o numero de livos, cde devd se existem
			if(this.nLivros > 0) {
				System.out.println("	livros:");
				for(int i =0; i < this.nLivros;i++) {
					r = this.vetLivros[i].toString();
					System.out.println(r);
				}
			}
			
			System.out.println("	Numero de CDs: "+ this.nCDs);
			if(this.nCDs > 0) {
				System.out.println("	Cds:");				
				for(int i =0;i<this.nCDs;i++) {
					r = this.vetCD[i].toString();
					System.out.println(r);
				}
				
			}
			
			System.out.println("	Numero de DVDs: " + this.nDVDs);
			if(this.nDVDs > 0) {
				System.out.println("DVDs:");
				for(int i =0 ; i <this.nDVDs;i++) {
					r = this.vetDVD[i].toString();
					System.out.println(r);
				}
			}
		}
		
		//inserir
		public void Inserir(int op) throws IOException { // op qual produto vai ser inserir
			int entradaInt;
			double entradaDouble;
			String entradaString;
			// creie cada caso para insercao
			if(this.EstoqueMax > this.QuanTotalProdutos){ // caso o estoque estive lotado
				if(op == 1) {// livros
					if(this.EstoqueMax > this.nLivros){
						System.out.println("	Inserir Codigo de Barra");
						entradaInt =EntradaTeclado.leInt(); //codigo de barras
						this.vetLivros[this.nLivros] = new Livros(entradaInt);
						
						System.out.println("	Inserir Nome");
						entradaString =EntradaTeclado.leString();
						this.vetLivros[this.nLivros].setNome(entradaString);
						
						System.out.println("	Inserir Autor/Autores");
						entradaString =EntradaTeclado.leString();
						this.vetLivros[this.nLivros].setAutor(entradaString);
								
						System.out.println("	Inserir Preco");
						entradaDouble = EntradaTeclado.leDouble();
						this.vetLivros[this.nLivros].setPreco(entradaDouble);
						
						System.out.println("	Numero de paginas");
						entradaInt = EntradaTeclado.leInt();
						this.vetLivros[this.nLivros].setnPaginas(entradaInt);
						
						System.out.println("	Numero de Capitulos");
						entradaInt = EntradaTeclado.leInt();
						this.vetLivros[this.nLivros].setnCapitulos(entradaInt);
						
						this.vetLivros[this.nLivros].setpodeVender(1); // pode vender o produto
	
						this.vetLivros[this.nLivros].setCategoria("Livros");
						
						this.nLivros+=1;
						this.QuanTotalProdutos+=1;
						return;
					}
					else {
						System.out.println(" 	Estoque de livros esta lotado");
						return;
					}
				} 
				else if(op == 2) {// dvds
					if(this.nDVDs < this.EstoqueMax) {
						System.out.println("	Inserir Codigo de Barra");
						entradaInt =EntradaTeclado.leInt(); //codigo de barras
						this.vetDVD[this.nDVDs] = new DVD(entradaInt);
						
						System.out.println("	Inserir Nome");
						entradaString =EntradaTeclado.leString();
						this.vetDVD[this.nDVDs].setNome(entradaString);
	
						System.out.println("	Inserir Autor/Autores");
						entradaString =EntradaTeclado.leString();
						this.vetDVD[this.nDVDs].setAutor(entradaString);												
								
						System.out.println("	Inserir Preco");
						entradaDouble = EntradaTeclado.leDouble();
						this.vetDVD[this.nDVDs].setPreco(entradaDouble);
					
						System.out.println("	Inseir Duracao");
						entradaInt = EntradaTeclado.leInt();
						this.vetDVD[this.nDVDs].setDuracao(entradaInt);
						
						this.vetDVD[this.nDVDs].setpodeVender(1);
						
						this.vetDVD[this.nDVDs].setCategoria("DVDs");
						
						this.nDVDs+=1;
						this.QuanTotalProdutos+=1;
						
					}else {
						System.out.println(" 	Estoque de DVDs esta lotado");
					}
				} 
				else if(op == 3) {//cds
					if(this.nCDs  < this.EstoqueMax) { // caso estoque ltado
						System.out.println("	Inserir Codigo de Barra");
						entradaInt =EntradaTeclado.leInt(); //codigo de barras
						this.vetCD[this.nCDs] = new CD(entradaInt);
						
						System.out.println("	Inserir Nome");
						entradaString =EntradaTeclado.leString();
						this.vetCD[this.nCDs].setNome(entradaString);
						
						System.out.println("	Inserir Autor/Autores");
						entradaString =EntradaTeclado.leString();
						this.vetCD[this.nCDs].setAutor(entradaString);
						
						System.out.println("	Inserir Preco");
						entradaDouble = EntradaTeclado.leDouble();
						this.vetCD[this.nCDs].setPreco(entradaDouble);
						
						System.out.println("	Inserir numero de musicas");
						entradaInt = EntradaTeclado.leInt();
						this.vetCD[this.nCDs].setnMusicas(entradaInt);
						
						System.out.println("	Inserir duracao");
						entradaInt = EntradaTeclado.leInt();
						this.vetCD[this.nCDs].setDuracao(entradaInt);
						
						this.vetCD[this.nCDs].setpodeVender(1);
						
						this.vetCD[this.nCDs].setCategoria("CDs");
						
						this.nCDs+=1;
						this.QuanTotalProdutos+=1;
						
						
					}else {
						System.out.println(" 	Estoque de Cds esta lotado");
					}
				} 
				else {
					System.out.println("      Escolher uma Opcao valida");
				}
			}else {
				System.out.println(" 	Estoque esta lotado");
			}
			
		}
		
		public void busca() throws IOException {
			System.out.println("	Busca por:\n1 -Codigo de barras \n2 -Nome");
			int op = EntradaTeclado.leInt();
			String r = null;
			int pos;
			while(op > 0) {
				
				if(op == 1) {
					System.out.println("	Inserir codigo");
					int cod = EntradaTeclado.leInt();
					 pos = this.buscaCod(cod,r);
					if(pos > -1) {
						break;
					}
					else {
						System.out.println("	Não existe esse item");
					}
					break;
				}else if(op == 2) {
					System.out.println("	Inserir Nome");
					String nome = EntradaTeclado.leString();
					pos = this.buscaCategoria(nome, r);
					if(pos > -1) {
						break;
					}
					else {
						System.out.println("	Não existe esse item");
					}
					break;
				}else {
					System.out.println("Opcao errada!!\n	Digite novamente");
					op = EntradaTeclado.leInt();
				}
			}
		}
		
		
		public int buscaCod(int cod, String r) {
			for(int i =0; i < this.nLivros;i++) {				
				if(cod == this.vetLivros[i].getCod_barras()) {
					r = this.vetLivros[i].toString();
					System.out.println(r);
					return i;
					}
				}
			
			for(int i =0;i<this.nCDs;i++) {
				if(cod == this.vetCD[i].getCod_barras()) {
					r = this.vetCD[i].toString();
					System.out.println(r);
					return i;
					}
				}
			for(int i =0 ; i <this.nDVDs;i++) {
				if(cod == this.vetDVD[i].getCod_barras()) {
					r = this.vetDVD[i].toString();
					return i;
					}
				}
			return -1;
		}
		
		
		public int buscaCategoria(String cod, String r) {
			String a;
			for(int i =0; i < this.nLivros;i++) {	
				a = this.vetLivros[i].getNome();
				if(cod.compareTo(a) == 0) {
					r = this.vetLivros[i].toString();
					System.out.println(r);
					return i;
					}
				}
			
			for(int i =0;i<this.nCDs;i++) {
				a = this.vetCD[i].getNome();
				if(cod.compareTo(a) ==0 ) {
					r = this.vetCD[i].toString();
					System.out.println(r);
					return i;
					}
				}
			for(int i =0 ; i <this.nDVDs;i++) {
				a = this.vetDVD[i].getNome();
				if(cod.compareTo(a) == 0 ) {
					r = this.vetDVD[i].toString();
					System.out.println(r);
					return i;
					}
				}
			return -1;
		}
		
		public void vender() throws IOException {
			String r = null;
			System.out.println("	Inserir codigo de barras");
			int cod = EntradaTeclado.leInt();
			int pos = this.buscaCod(cod, r);
			if(pos > -1) {
				if(	this.vetLivros[pos].getCod_barras() == cod) { // livros
					if(this.vetLivros[pos].getPodeVender() == 1) {
						this.vetLivros[pos].setpodeVender(0); // produto vendido
					}else {
						System.out.println("\n	Produto ja vendido");
					}
					
				}else if(this.vetCD[pos].getCod_barras() == cod) { // cds
					if(this.vetCD[pos].getPodeVender() == 1) {
						this.vetCD[pos].setpodeVender(0);// produto vendido
					}else {
						System.out.println("\n	Produto ja vendido");
					}
				}else if(this.vetDVD[pos].getCod_barras() == cod) {1
					if(this.vetDVD[pos].getPodeVender() == 1) {
						this.vetDVD[pos].setpodeVender(0);// produto vendido
					}else {
						System.out.println("\n		Produto ja vendido");
					}
				}else{
						System.out.println("\nErro!!!");
					return;
				}
			}else {
				System.out.println("	Produto nao existe");
			}
		}
	}
	
