import java.awt.peer.MenuPeer;
import java.io.IOException;

//igor guilherme pereira loredo
// 11275071

/*
 * Crie uma agenda de contatos. Nessa agenda, contatos podem ser adicionados, removidos, ou pesquisados por nome ou por CPF/CNPJ.
 *  Deve ser poss�vel, tamb�m, visualizar todos os contatos da agenda.Dois tipos de contatos podem fazer parte da agenda: pessoa f�sica e 
 *  pessoa jur�dica. A pessao f�sica tem os seguintes atributos: CPF, nome, endere�o, data de nascimento, email, estado civil, 
 *  outros quevoc� achar necess�rios.
 *  A pessoa jur�dica possui: CNPJ, nome, endere�o, email, inscri��o estadual, raz�o social, outros que voc� achar necess�rios.
 * */
public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		int op = 1;
		
		do {
			OrgAgenda.menuPrincipal();
			op = EntradaTeclado.leInt();
			switch (op) {
				case 1: // inserir
					OrgAgenda.menuOP();
					
					break;
				case 2:
					OrgAgenda.menuOP();
					 
					break;
				case 3:
					OrgAgenda.menuOP();
					
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
	
}
