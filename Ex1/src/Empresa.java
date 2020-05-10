
//igor guilherme pereira loredo
// 11275071


public class Empresa extends Agenda{
	public String Cnpj;
	public String InscricaoEstadual;
	public String RazaoSocial;
	
	
	public String toString() {
		String novo = "Nome :" + this.Nome + " CPF " + this.Cnpj  +" Email " + this.Email+  " InscricaoEstadual "
				+ this.InscricaoEstadual + " Endereco " + this.Endereco + " Razao Social " + this.RazaoSocial;
		return novo;
	}
	
	/*public void toString() {
		System.out.println("Nome :" + this.Nome);
		System.out.println("CPF");
		
		System.out.println("Email :");
		System.out.println("Usuario");
		System.out.println("Usuario");
		System.out.println("Usuario");
		System.out.println("Usuario");
		
	} */
	
	
	public void setCnpj(String r) {
		this.Cnpj = r;
	}
	
	public void setInscricaoEstadual(String r){
		this.InscricaoEstadual = r;
	}
	
	public void setRazaoSocial(String r) {
		this.RazaoSocial = r;		
	}
	
	public String getCnpf() {
		return this.Cnpj;
	}
	
	public String getInscricaoEstadual() {
		return this.InscricaoEstadual;
	}
	
	public String getRazaoSocial() {
		return this.RazaoSocial;
	}
	
	
}
