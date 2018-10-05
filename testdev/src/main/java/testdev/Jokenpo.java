package testdev;

	enum jogo {
		pedra, papel, tesoura
	}

	enum Resultado {
		jogador1, jogador2, empate
	}
	
	public class Jokenpo {
		
		
	
	public Resultado jokenpo(jogo jogo1, jogo jogo2){
		if(jogo1 == jogo2)
			return Resultado.empate;
		
		switch(jogo1){
			case pedra:
				if(jogo2 == jogo.papel) return Resultado.jogador2;
				break;
			case tesoura:
				if(jogo2 == jogo.pedra) return Resultado.jogador2;
				break;
			case papel:
				if(jogo2 == jogo.tesoura) return Resultado.jogador2;
				break;
		}
		
		return Resultado.jogador1;
	}
}

