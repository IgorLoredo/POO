
//igor guilherme pereira loredo
// 11275071


public class Empresa extends Agenda{
	public String Cnpj;
	public String InscricaoEstadual;
	public String RazaoSocial;
	
	
	public  void setCnpj(String r) {
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
