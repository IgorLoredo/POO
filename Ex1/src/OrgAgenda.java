import java.io.IOException;

public class OrgAgenda {
		public int nPessoas;
		public int nEmpresas;
		public Pessoa []vetPessoas;
		public Empresa[] vetEmpreas; 
	
	public OrgAgenda(int pessoas, int empresas) {
		try {
			this.nPessoas =  pessoas;
			this.nEmpresas = empresas;
			this.vetEmpreas = new Empresa[this.nPessoas];
			this.vetPessoas = new Pessoa[this.nEmpresas];
			
			for(int i =0 ; i < pessoas; i++) {
				this.vetEmpreas[i] = new Empresa();
			}
			
			for(int i =0 ; i < empresas; i++) {
				this.vetPessoas[i] = new Pessoa();
			}
		
		}catch(IllegalArgumentException e) {
			
		}
		
	}
	
	public OrgAgenda() {
		this.nPessoas =  0;
		this.nEmpresas = 0;
		//nao sei como fazer alocacao dimanica em java
		this.vetEmpreas = new Empresa[1000];
		this.vetPessoas = new Pessoa[1000];
	}
	
	public void menuPrincipal() {
		System.out.println("Escolha uma opcao");
		System.out.println("1 - Inseri");
		System.out.println("2 - Procurar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Mostrar Agenda completa");
		System.out.println("5 - Sair");
	}
	
	
	public static void menuOP(){
		System.out.println("1 - Pessoa Fisica");
		System.out.println("2 - Pessoa Juridica");
	}
	
	public void PrintALL() {
		System.out.println(" Pessoas : ");
		for(int i =0; i < this.nPessoas;i++) {
			String r = this.vetPessoas[i].toString();
			System.out.println(r);			
		} 
		
		System.out.println("Empresas : ");
		
		for(int i =0; i < this.nEmpresas;i++) {
			String r = this.vetEmpreas[i].toString();
			System.out.println(r);
			
		}
	}
	
	public int PesquisaCPF(String cpf) {
		try {
			String R;
			for(int i =0; i < this.nPessoas;i++){
				R = this.vetPessoas[i].getCpf(); 
				if(R == cpf) {
					sy
					String r = this.vetPessoas[i].toString();
					System.out.println(r);
					return 1;
				}
			}
			System.out.println("Nao existe esse CPF na agenda");
			return 0;
		}catch(IllegalArgumentException e) {
			}
		return 0;
	}
	
	public int PesquisaCNPJ(String cnpj) {
		try {
			for(int i =0; i < this.nEmpresas;i++){ 
				if(this.vetEmpreas[i].Cnpj == cnpj) {
					String r = this.vetEmpreas[i].toString();
					System.out.println(r);
					return 1;
				}
			}
			System.out.println("Nao existe esse CNPJ na agenda");
			return 0;
		}catch(IllegalArgumentException e) {
			}
		
	return 0;
	}
	
	/* nome 
	 * cpf
	 * endereco
	 * email
	 * data de nacimento
	 * estado civil
	 * */
	
	public void inseriPessoa() throws IOException {
		String r;
		vetPessoas[nPessoas] = new Pessoa();
		System.out.println("Inseri o nome ");
		r = EntradaTeclado.leString();
		vetPessoas[nPessoas].setNome(r);
		
		System.out.println("Inseri o Cpf ");
		r = EntradaTeclado.leString();
		this.vetPessoas[this.nPessoas].setCpf(r);
		
		System.out.println("Inseri o Endereco ");
		r = EntradaTeclado.leString();
		this.vetPessoas[this.nPessoas].setEndereco(r);
		
		System.out.println("Inseri o Email ");
		r = EntradaTeclado.leString();
		this.vetPessoas[this.nPessoas].setEmail(r);
		
		System.out.println("Inseri o Data de Nascimento ");
		r = EntradaTeclado.leString();
		this.vetPessoas[this.nPessoas].setDataNascimento(r);
		
		System.out.println("Inseri o Estado Civil ");
		r = EntradaTeclado.leString();
		this.vetPessoas[this.nPessoas].setEstadoCivil(r);
		
		this.nPessoas+=1;
		System.out.println(this.nPessoas);
	}
	
	
	/* nome 
	 * cpf
	 * endereco
	 * email
	 * InscricaoEstadual
	 * RazaoSocial
	 * */
	
	
	public void inseriEmpresa() throws IOException {
		String r;
		this.vetEmpreas[this.nEmpresas] = new Empresa();
		
		System.out.println("Inseri o nome ");
		r = EntradaTeclado.leString();
		this.vetEmpreas[this.nEmpresas].setNome(r);

		System.out.println("Inseri o CNPJ ");
		r = EntradaTeclado.leString();
		this.vetEmpreas[this.nEmpresas].setCnpj(r);
		
		System.out.println("Inseri o endereco ");
		r = EntradaTeclado.leString();
		this.vetEmpreas[this.nEmpresas].setEndereco(r);
		
		System.out.println("Inseri o email ");
		r = EntradaTeclado.leString();
		this.vetEmpreas[this.nEmpresas].setEmail(r);
		
		System.out.println("Inseri InscricaoEstadual ");
		r = EntradaTeclado.leString();
		this.vetEmpreas[this.nEmpresas].setInscricaoEstadual(r);
		
		System.out.println("Inseri Razao Social ");
		r = EntradaTeclado.leString();
		this.vetEmpreas[this.nEmpresas].setRazaoSocial(r);
		
		this.nEmpresas +=1;
	}
	

}




