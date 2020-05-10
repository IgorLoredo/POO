

public class Pessoa extends Agenda{
	public String Cpf;
	public String DataNascimento;
	public String EstadoCivil;
	
	public  void setCpf(String r) {
		this.Cpf = r;
	}
	
	public void setDataNascimento(String r){
		this.DataNascimento = r;
	}
	
	public void setEstadoCivil(String r) {
		this.EstadoCivil = r;		
	}
	
	public String getCpf() {
		return this.Cpf;
	}
	
	public String getDataNascimento() {
		return this.DataNascimento;
	}
	
	public String getEstadoCivil() {
		return this.EstadoCivil;
	}
	
	
}