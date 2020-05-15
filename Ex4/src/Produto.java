//igor guilherme pereira loredo 11275071

// produto -> livro categoria
// produto -> cd
// produto -> dvd 

public class Produto {
	public String Nome; // variaveis comuns para todos os produtos
	public String Autor;
	public String Categoria;
	public double preco;
	public int cod_barras;
	public int PodeVender;

	public Produto() {
		this.cod_barras = -1;
	}
	
	public Produto (int cod_Barras){
		this.cod_barras = cod_Barras;
		
	}
	
	// a classe toString do produto estava dando pau com as das filhas,nisso n sabia lidar com a situaçao e deixe para vc 
	/// me explicarei nos comentarios do meu codigo, pf		
	/*public String toString(){
		return "\nCodigo de Barra: " + this.cod_barras
				+  "\nNome: " + this.Nome +
				"\nAutor " + this.Autor +
				"\nPreco: " + this.preco +
				"\n Categoria " + this.Categoria;	
	}*/
	
	// metodos set
	public void setNome(String r) {
		this.Nome = r;
	}
	
	public void setAutor(String r) {
		this.Autor = r;
	}
	
	public void setCategoria(String r) {
		this.Categoria = r;
	}
	
	public void setPreco(double r) {
		this.preco = r;
	}
	
	public void setpodeVender(int en) {
		this.PodeVender = en;
	}
	public void setCodigoBarras(int num) {
		this.cod_barras = num;
	}
	
	// metodos get 
	public int getCod_barras() {
		return this.cod_barras;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public String getAutor() {
		return this.Autor;
	}
	
	public String getCategoria() {
		return this.Categoria;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getPodeVender() {
		return this.PodeVender;
	}
	
	
}
