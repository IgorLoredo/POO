import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bozo.Placar;

public class PlacarTest {

	@Test
	public void testPlacarMin() {
		int []dado = {1,1,1,1,1};
		Placar p1 = new Placar();
		p1.add(dado, -1);
	}
	
	@Test
	public void testPlacarMax() {
		int []dado = {1,1,1,1,1};
		Placar p1 = new Placar();
		p1.add(dado, 12);
	}
	
	@Test
	public void testAdd(){ // todos com sequencia com pontuacao maxima
		Placar p1 = new Placar();
		p1.add(new int[]{1,1,1,1,1}, 1);
		p1.add(new int[] {2,2,2,2,2}, 2);
		p1.add(new int[]{3,3,3,3,3}, 3);
		p1.add(new int[]{4,4,4,4,4}, 4);
		p1.add(new int[]{5,5,5,5,5}, 5);
		p1.add(new int[]{6,6,6,6,6}, 6);
		p1.add(new int[]{3,3,6,6,6}, 7);
		p1.add(new int[]{6,6,6,6,6}, 8);
		p1.add(new int[]{6,6,6,6,6}, 9);
		p1.add(new int[]{6,6,6,6,6}, 10);
	}
	private Placar p1;

	@Test
	public void testAddDifentes(){ // todos com um numero diferente
		Placar p1 = new Placar();
		p1.add(new int[]{1,1,1,1,2}, 1);
		p1.add(new int[] {2,2,2,2,3}, 2);
		p1.add(new int[]{3,3,3,3,4}, 3);
		p1.add(new int[]{4,4,4,4,5}, 4);
		p1.add(new int[]{5,5,5,5,6}, 5);
		p1.add(new int[]{1,2,3,4,5}, 6);
		p1.add(new int[]{1,2,3,4,4}, 7);
		p1.add(new int[]{1,1,2,4,1}, 8);
		p1.add(new int[]{1,1,1,4,2}, 9);
		p1.add(new int[]{1,2,3,4,5}, 10);
	}
	 
	
	@Test
	public void testAddSup(){ // todos com um numero diferente
		Placar p1 = new Placar();
		p1.add(new int[]{1,1,1,1,2}, 1);
		p1.add(new int[] {2,2,2,2,3}, 2);
		p1.add(new int[]{3,3,3,3,4}, 3);
		p1.add(new int[]{4,4,4,4,5}, 4);
		p1.add(new int[]{5,5,5,5,6}, 5);
		p1.add(new int[]{6,6,6,6,7}, 6);
		p1.add(new int[]{3,3,6,6,6}, 7);
		p1.add(new int[]{6,6,6,6,6}, 8);
		p1.add(new int[]{6,6,6,6,6}, 9);
		p1.add(new int[]{6,6,6,6,6}, 10);
	
	}
	
	@Test
	public void testGetScore() {
		Placar p1 = new Placar(); // testa com a pontuação maxima que pode entrar
		p1.add(new int[]{1,1,1,1,1}, 1);
		int k = p1.getScore();
		assertEquals(-4, k);
	}

	@Test
	public void testToString() { // testa  tostring
		Placar p1 = new Placar();
		p1.toString();
		for(int i =0; i< 10;i++) {
			p1.placarAtual[i] =1;
		}
		int k =  p1.getScore();
		//System.out.println(p1.toString());
		p1.toString();
				
	}
	
	@Test
	public void testClone() { // testando a clonagem
		Placar p1 = new Placar();
		Placar p2 = p1;
		assertSame(p2,p1);
	}


}
