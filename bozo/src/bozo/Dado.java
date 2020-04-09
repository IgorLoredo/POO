package bozo;

public class Dado {
	private int lados;
	private Random rand;
	private int LadoCima;
	public int rolar() {
		try {
			LadoCima = rand.getIntRand(1, lados+1); // usa a fun��o random
		} catch(IllegalArgumentException e) {
			System.out.println("N�mero de lados inv�lido");
		}	
		
		return getLado(); // retoma o numero sorteador
	}
	
	public Dado() { // defeat com 6 lados
		lados = 6;
		rand = new Random();
		rolar();
	}
	
	public Dado(int n) { // construtor que usar mais/menos de 6 lados
		if (n <= 1)
			throw new IllegalArgumentException("Numero de dados dever ser maior que 1");
		rand = new Random(); // cria um elemento para rolar o dados
		lados = n;
		rolar();
	}
	
	public int getLado() {
		
		return LadoCima;
	}
	
	public String toString() {
		String visaolados = " ";
		
		return visaolados;
	}
}
