import java.awt.peer.MenuPeer;
import java.io.IOException;

//igor guilherme pereira loredo
// 11275071

/*
 * Crie uma agenda de contatos. Nessa agenda, contatos podem ser adicionados, removidos, ou pesquisados por nome ou por CPF/CNPJ.
 *  Deve ser possível, também, visualizar todos os contatos da agenda.Dois tipos de contatos podem fazer parte da agenda: pessoa física e 
 *  pessoa jurídica. A pessao física tem os seguintes atributos: CPF, nome, endereço, data de nascimento, email, estado civil, 
 *  outros quevocê achar necessários.
 *  A pessoa jurídica possui: CNPJ, nome, endereço, email, inscrição estadual, razão social, outros que você achar necessários.
 * */
public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		int op = 1;
		Pessoa 
		do {
			menuPrincipal();
			op = EntradaTeclado.leInt();
			switch (op) {
				case 1: // inserir
					menuOP();
					
					break;
				case 2:
					menuOP();
					 
					break;
				case 3:
					menuOP();
					
					break;
				case 4:
					
					break;
				case 5: 
					op = 0;
					break;
				default:
					System.out.println("Opcao errada!!");
					break;
				}
			
		}while(op> 1);

	}
	
	public static void menuPrincipal() {
		System.out.println("Escolha uma opcao");
		System.out.println("1 - Inseri");
		System.out.println("2 - Procurar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Mostrar Agenda completa");
		System.out.println("5 - Sair");
	}
	
	public static void menuOP(){
		System.out.println("1 - Pessoa Fisica");
		System.out.println("1 - Pessoa Juridica");
	}
	
	

}
