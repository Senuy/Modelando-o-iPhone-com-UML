package aparelhos.apple;

import aparelhos.acessointernet.NavegadorNaInternet;
import aparelhos.aparelhoTelefonico.AparelhoTelefonico;
import aparelhos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {

	
	public void exibirPagina(String url) {
		System.out.println("Acessando site: "+url+" via iphone");
		
	}

	
	public void acionarNovaAba() {
		System.out.println("Acessando nova aba via iphone");
		
	}

	
	public void atualizarPagina() {
		System.out.println("Atualizando página via iphone");
		
	}

	
	public void tocar() {
		System.out.println("Tocando via iphone");
		
	}

	
	public void pausar() {
		System.out.println("Pausando via iphone");
		
	}

	
	public void selecionarMusica(String musica) {
		System.out.println("Tocando: "+musica+" via iphone");
		
	}

	
	public void ligar(String numero) {
		System.out.println("ligando para "+numero+" via iphone");
		
	}

	
	public void atender() {
		System.out.println("Atendendo via iphone");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Acessando correio de voz via iphone");
		
	}

}
