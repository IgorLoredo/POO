import java.io.IOException;
//igor guilherme pereira loredo
//11275071

/*
* use o cpf como metodo de busca pq não haveria um igual
* criei uma classe agenda que tem duas classes filhas pessoa  empresa
* e ainda criei uma classes para gerenciar tudo (org agenda) 
*/

public class Ex2 {

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
					if (op == 1) {
						agenda.inseriPessoa();
						agenda.OrdenarCPF(); // ordena
					}
					else {
						agenda.inseriEmpresa();
						agenda.OrdenarCNPJ(); // ordena
					}
					break;
					
				case 2: // busca
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
					if (op == 1) {
						System.out.println("CPF para Apagar:");
						cpf = EntradaTeclado.leString();
						agenda.apagarPessoa(cpf);						
					}else {
						System.out.println("CNPJ para Apagar:");
						cnpj = EntradaTeclado.leString();
						agenda.apagarEmpresa(cnpj);
					}
					
					break; 
					
				case 4: // printa tuydo
					agenda.PrintALL();
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
