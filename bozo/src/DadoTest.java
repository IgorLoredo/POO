import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bozo.Dado;

public class DadoTest {

	@Test
	public void testRolar() {
		Dado d1  = new Dado();
		int k = d1.LadoCima;
		int n = d1.getLado();
		assertEquals(k, n);
	}
	
	@Test
	public void testDado() {
		Dado d1  = new Dado(-1);
	}
	
	@Test
	public void testDadoInt() {
		Dado d1  = new Dado(5);
		int k = d1.LadoCima;
		int n = d1.getLado();
		assertEquals(k, n);
	}

	@Test
	public void testGetLado() {
		Dado d1  = new Dado();
		int k = d1.LadoCima;
		int n = d1.getLado();
		assertEquals(k, n);
	}

	@Test
	public void testToString() {
		Dado d1  = new Dado();
		String r1 = d1.toString();
		Dado d2  = new Dado();
		String r2 = d2.toString();
		Dado d3  = new Dado();
		String r3 = d3.toString();
		Dado d4  = new Dado();
		String r4 = d4.toString();
		Dado d5  = new Dado();
		String r5 = d5.toString();
		Dado d6  = new Dado();
		String r6 = d6.toString();
		
	}




}
