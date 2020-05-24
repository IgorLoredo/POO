import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bozo.Placar;

public class PlacarTest {

	@Test
	public void testPlacar() {
		Placar p1 = new Placar();
		
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetScore() {
		Placar p1 = new Placar();
		int []dado= new int[10];
		for(int i =0; i< 10;i++) {
			dado[i] = 1;
		}
		p1.add(dado, 1);
		int k =  p1.getScore();
		System.out.println(k);
		assertEquals(k, 5);
	}

	@Test
	public void testToString() { // testa  tostring
		Placar p1 = new Placar();
		p1.toString();
		for(int i =0; i< 10;i++) {
			p1.placarAtual[i] =1;
		}
		p1.toString();
				
	}
	
	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() { // testando a clonagem
		Placar p1 = new Placar();
		Placar p2 = p1;
		assertSame(p2,p1);
	}


}
