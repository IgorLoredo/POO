import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bozo.Placar;
import bozo.RolaDados;

public class RolaDadosTest {

	@Test
	public void testRolaDados() {
		RolaDados dado = new RolaDados(6);
		int k = dado.quantLados;
		assertEquals(k,dado.quantLados);
	}

	@Test
	public void testRolar() { // testq com 1 unidade
		RolaDados dado = new RolaDados(1);
		int []k = dado.rolar();
	}

	@Test
	public void testRolarRola() { // dar errado para forçar negativo
		RolaDados dado = new RolaDados(-1);
	}

	@Test
	public void testRolarString() {
		RolaDados dado = new RolaDados(1);
		String s = "1";
		int []k = dado.rolar(s);
		s = "2";
		k = dado.rolar(s); // dar errado
	}

	@Test
	public void testToString() {
		RolaDados d1 = new RolaDados(6);
		String r = d1.toString();
		d1.rolar();
		d1.toString();
		d1.rolar();
		d1.toString();
	}

	@Test
	public void testClone() {
		RolaDados d1 = new RolaDados(6);
		RolaDados d2 = d1;
		assertSame(d1,d2);
	}

}
