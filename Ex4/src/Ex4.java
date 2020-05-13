import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		int op = 1;
		
		while(op!=0) {
			Loja.Menu();
			op = EntradaTeclado.leInt();
			switch (op) {
				case 1: // inseri
					
					break;
	
				default:
					break;
			}
		}
	}
}
