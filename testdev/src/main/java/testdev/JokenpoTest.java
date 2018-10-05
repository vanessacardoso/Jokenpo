package testdev;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JokenpoTest {

	Jokenpo jokenpo;
	jogo jogo;
	Resultado result;
	
	@Before
	public void setup(){
		jokenpo= new Jokenpo();
	}
	
	@Test
	public void empate_papel(){
		assertEquals(Resultado.empate, jokenpo.jokenpo(jogo.papel, jogo.papel));
	}
	
	@Test
	public void empate_pedra(){
		assertEquals(Resultado.empate, jokenpo.jokenpo(jogo.pedra, jogo.pedra));
	}

	@Test
	public void empate_tesoura(){
		assertEquals(Resultado.empate, jokenpo.jokenpo(jogo.tesoura, jogo.tesoura));
	}

	
	@Test
	public void Ganhador_Pedra(){
		assertEquals(Resultado.jogador1, jokenpo.jokenpo(jogo.pedra, jogo.tesoura));
	}
	
	@Test 
	public void Ganhador_Tesoura(){
		assertEquals(Resultado.jogador1, jokenpo.jokenpo(jogo.tesoura,jogo.papel));
	}
	
	@Test
	public void Ganhador_Papel(){
		assertEquals(Resultado.jogador1, jokenpo.jokenpo(jogo.papel, jogo.pedra));		
	}
	
	@Test
	public void PerdedorPapel(){
		assertEquals(Resultado.jogador2, jokenpo.jokenpo(jogo.papel, jogo.tesoura));
	}

	@Test
	public void PerdedorTesoura(){
		assertEquals(Resultado.jogador2, jokenpo.jokenpo(jogo.tesoura, jogo.pedra));
	}

	@Test
	public void Perdedor_Pedra(){
		assertEquals(Resultado.jogador2, jokenpo.jokenpo(jogo.pedra, jogo.papel));
	}

	
}
