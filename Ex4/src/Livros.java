
/* Crie uma hierarquia de classes para representar os produtos de uma loja: livros, CDs e DVDs.
 * Um produto � identificado unicamente pelo seu c�digo de barras. Implemente, tamb�m,
 * uma classe Loja que permite que sejam armazenados os  produtos e que permita que possam ser adicionados produtos (numa certa quantidade), 
 * possam ser buscados produtos por c�digo de barras ou por nome e possam ser vendidos produtos, dado seu c�digo de barras. � desej�vel, tamb�m, 
 *uma funcionalidade que permita verificar todo o estoque da loja,
 *mostrando o n�mero de itens por produto e por categoria.
 **/

public class Livros extends Produto {
	
	
	public Livros(int cod_Barras) {
		super(cod_Barras);
	}

}
