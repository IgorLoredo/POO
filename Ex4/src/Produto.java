

// produto -> livro categoria
// produto -> cd
// produto -> dvd 

public class Produto {
	public String Nome;
	public String Autor;
	public String Categoria;
	public double preco;
	public int cod_barras;
	

	public Produto() {
		this.cod_barras = -1;
	}
	
	public Produto (int cod_Barras){
		this.cod_barras = cod_Barras;
	}
	
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
	
	
	
	
}
