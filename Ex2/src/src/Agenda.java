

public class Agenda {
	public String Nome;
	public String Endereco;
	public String Email;
	
	public Agenda() {
		this.Nome= "0";
		this.Endereco = "0";
		this.Email = "0";
	}
	
	
	public void setNome(String r) {
		this.Nome = r;
	}
	
	public void setEmail(String r) {
		this.Email = r;
	}
	
	public void setEndereco(String r) {
		this.Endereco = r;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public String getEndereco() {
		return this.Endereco;
	}
	
	public String getEmail(){
		return this.Email;
	}
	
	
}



