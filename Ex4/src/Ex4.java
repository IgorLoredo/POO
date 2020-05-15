import java.io.IOException;


/* Crie uma hierarquia de classes para representar os produtos de uma loja: livros, CDs e DVDs.
 * Um produto � identificado unicamente pelo seu c�digo de barras. Implemente, tamb�m,
 * uma classe Loja que permite que sejam armazenados os  produtos e que permita que possam ser adicionados produtos (numa certa quantidade), 
 * possam ser buscados produtos por c�digo de barras ou por nome e possam ser vendidos produtos, dado seu c�digo de barras. � desej�vel, tamb�m, 
 *uma funcionalidade que permita verificar todo o estoque da loja,
 *mostrando o n�mero de itens por produto e por categoria.
 **/


public class Ex4 {

	public static void main(String[] args) throws IOException {
		int op = 1;
		Loja lojaNova = new Loja();
		
		while(op!=0) {
			Loja.Menu();
			op = EntradaTeclado.leInt();
			switch (op) {
				case 1: // inseri
					Loja.MenuOP();
					op = EntradaTeclado.leInt();
					if(op == 1) {} // livros
					else if(op == 2) {} // dvds
					else if(op == 3) {} //cds
					else {
						System.out.println("      Escolher uma Opcao valida");
					}
					break;
					
				case 2: // buscar
					Loja.MenuOP();
					op = EntradaTeclado.leInt();
					if(op == 1) {} // livros
					else if(op == 2) {} // dvds
					else if(op == 3) {} //cds
					else {
						System.out.println("      Escolher uma Opcao valida");
					}
					break;
					
				case 3: //mostrar estoque
					
					break;
					
				case 4: //vender
					Loja.MenuOP();
					op = EntradaTeclado.leInt();
					if(op == 1) {} // livros
					else if(op == 2) {} // dvds
					else if(op == 3) {} //cds
					else {
						System.out.println("      Escolher uma Opcao valida");
					}
					break;
					
				case 5:
					System.out.println("   Saindo ");
					break;
					
				default:
					System.out.println("      Escolher uma Opcao valida");
					break;
			}
			
		}
	}
}
