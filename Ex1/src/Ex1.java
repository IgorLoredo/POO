
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
		String cnpj,cpf;
		int op = 1;
		OrgAgenda agenda = new OrgAgenda();
		
		while(op!=0) {
			System.out.println();
			agenda.menuPrincipal();
			op = EntradaTeclado.leInt();
			switch (op) {
				case 1: // inserir
					OrgAgenda.menuOP();
					op = EntradaTeclado.leInt();
					if (op == 1)
						agenda.inseriPessoa();
					else
						agenda.inseriEmpresa();
						
					break;
					
				case 2:
					OrgAgenda.menuOP();
					op = EntradaTeclado.leInt();
					if (op == 1) {
						System.out.println("CPF para Buscar:");
						cpf = EntradaTeclado.leString();
						agenda.PesquisaCPF(cpf);						
					}else {
						cnpj = EntradaTeclado.leString();
						agenda.PesquisaCNPJ(cnpj);
					}
					break;
				case 3:
					OrgAgenda.menuOP();
					op = EntradaTeclado.leInt();
					
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
			
			
		}
		
	}
	
}
