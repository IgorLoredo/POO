import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bozo.Dado;

public class DadoTest {

	@Test
	public void testRolar() {
		// rola dos dados
		Dado d1  = new Dado();
		int k = d1.LadoCima;
		int n = d1.getLado();
		assertEquals(k, n);
		d1.rolar(); // rola novamente 
		assertEquals(k, n); // compara com o antigamente
	}
	
	@Test
	public void testDado() {		
		Dado d2  = new Dado(); // tem que dar certo
		d2.lados = -1;
		d2.rolar(); // caso teste com lados negativos
		// neste caso deve n rodar pra provar os casos teste errados
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
	public void testToString() { // teste unico do toString
		Dado d1  = new Dado();
		String r1 = d1.toString(); // tem ser o caso teste		
		
	}
	
	@Test
	public void testeTostring() { // teste completo  de casa tostring
		Dado d1  = new Dado();
		d1.LadoCima =1;
		d1.toString();
		d1.LadoCima = 2;
		d1.toString();
		d1.LadoCima = 3;
		d1.toString();
		d1.LadoCima = 4;
		d1.toString();
		d1.LadoCima = 5;
		d1.toString();
		d1.LadoCima = 6;
		d1.toString();
	}
	
	@Test
	public void testObject() { // testa a inicialização
		Dado d1  = new Dado(5);
		int lado1 = d1.lados;
		Dado d2  = new Dado();
		int lado2 = d2.lados;
		assertEquals(5,lado1);
		assertEquals(6,lado2);
	}


	
	@Test
	public void testClone() {
		Dado d1  = new Dado();
		Dado d2  = d1;
		assertSame(d1,d2);
	}


}
