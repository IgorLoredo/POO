//igor guilherme pereira loredo 11275071


public class DVD extends Produto {
	public int duracao;
	
	public DVD() {
		this.duracao = 0;
	}
	
	
	public DVD(int cod_Barras) {
		super(cod_Barras);
	}
	
	public String toString() {
		String r ="\nCodigo de Barra: " + this.cod_barras
				+  "\nNome: " + this.Nome +
				"\nAutor " + this.Autor +
				"\nPreco: " + this.preco +
				"\n Categoria " + this.Categoria +"\nDuracao "+ this.duracao
				+"\nPode vender: "+ this.PodeVender;
		return r;
	}

	public void setDuracao(int num) {
		this.duracao = num;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
}
