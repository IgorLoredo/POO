
public class Pessoa extends Agenda{
	public String Cpf;
	public String DataNascimento;
	public String EstadoCivil;
	
	public Pessoa() {
		this.Cpf = "0";
		this.DataNascimento = "0";
		this.EstadoCivil= "0";
	}
	
	public String toString() {
		String novo = "Nome : " + this.Nome + " CPF " + this.Cpf +" Email " + this.Email+  " Estado Civil "
				+ this.EstadoCivil + " Endereco " + this.Endereco + " Data de Nascimento "+ this.DataNascimento;
		return novo;
	}
	
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