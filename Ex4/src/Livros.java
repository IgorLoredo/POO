
/* Crie uma hierarquia de classes para representar os produtos de uma loja: livros, CDs e DVDs.
 * Um produto � identificado unicamente pelo seu c�digo de barras. Implemente, tamb�m,
 * uma classe Loja que permite que sejam armazenados os  produtos e que permita que possam ser adicionados produtos (numa certa quantidade), 
 * possam ser buscados produtos por c�digo de barras ou por nome e possam ser vendidos produtos, dado seu c�digo de barras. � desej�vel, tamb�m, 
 *uma funcionalidade que permita verificar todo o estoque da loja,
 *mostrando o n�mero de itens por produto e por categoria.
 **/

public class Livros extends Produto {
	public int nPaginas;
	public int nCapitulos;
	
	public Livros () {
		this.nPaginas =0;
	}
	
	public Livros(int cod_Barras) {
		super(cod_Barras);
	}
	
	public String toString() {
		String r = "\nCodigo de Barra: " + this.cod_barras
				+  "\nNome: " + this.Nome +
				"\nAutor " + this.Autor +
				"\nPreco: " + this.preco +
				"\n1Categoria " + this.Categoria +
				"\nNumero de Paginas "+ this.nPaginas + 
				"\nNumero de capitulos " + this.nCapitulos;
		return r;
	}
	
	//sets
	public void setnPaginas(int num) {
		this.nPaginas = num;
	}
	
	public void setnCapitulos(int num) {
		this.nCapitulos = num;
	}
	
	//gets
	public int getNPaginas() {
		return this.nPaginas;
	}
	
	public int getNCapitulos() {
		return this.nCapitulos;
	}
	
	
}
