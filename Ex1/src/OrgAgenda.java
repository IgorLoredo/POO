
public class OrgAgenda {
		public int nPessoas;
		public int nEmpresas;
		public Pessoa []vetPessoas;
		public Empresa[] vetEmpreas; 
	
	public OrgAgenda(int pessoas, int empresas) {
		this.nPessoas =  pessoas;
		this.nEmpresas = empresas;
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
	
	public void Organizar() {
		
		
	}
}
