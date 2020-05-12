
public class OrgAgenda {
		public int nPessoas;
		public int nEmpresas;
		public Pessoa []vetPessoas;
		public Empresa[] vetEmpreas; 
	
	public OrgAgenda(int pessoas, int empresas) {
		try {
			this.nPessoas =  pessoas;
			this.nEmpresas = empresas;
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
			for(int i =0; i < this.nPessoas;i++){
				if(this.vetPessoas[i].Cpf == cpf) {
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
	
	public void inseriPessoa(String cpf) {
		
		
	}
}
