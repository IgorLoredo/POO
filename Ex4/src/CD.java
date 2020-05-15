


public class CD extends Produto {
	public int nMusicas;
	public int duracao;

	public CD() {
		this.preco = 0;
	}
	
	public CD(int cod_Barras) {
		super(cod_Barras); // insere o codigo de barras
	}
	
	// to string
	public String toString() { // o toString de produto
		String r = "\nCodigo de Barra: " + this.cod_barras
				+  "\nNome: " + this.Nome +
				"\nAutor " + this.Autor +
				"\nPreco: " + this.preco +
			"\n Categoria " + this.Categoria +"\nNumero de Musicas "+
				this.nMusicas + "\nDuracao " 
				+ this.duracao;
		return r;
	}
	
	// sets da classes cds
	public void setnMusicas(int num) {
		this.nMusicas = num;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	//gets
	public int getnMusicas() {
		return this.nMusicas;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	

}
