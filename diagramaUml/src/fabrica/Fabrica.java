package fabrica;

import aparelhos.acessointernet.NavegadorNaInternet;
import aparelhos.acessointernet.Notebook;
import aparelhos.aparelhoTelefonico.AparelhoTelefonico;
import aparelhos.aparelhoTelefonico.TelefoneCelular;
import aparelhos.reprodutorMusical.Ipod;
import aparelhos.reprodutorMusical.ReprodutorMusical;
import aparelhos.apple.Iphone;

public class Fabrica {

	public static void main(String[] args) {

		/*
		 * ReprodutorMusical ipod = new Ipod();
		 * 
		 * ipod.tocar(); ipod.selecionarMusica("Rammstein"); ipod.pausar();
		 * 
		 * 
		 * AparelhoTelefonico celular = new TelefoneCelular();
		 * 
		 * celular.atender(); celular.iniciarCorreioVoz(); celular.ligar("2255-5588");
		 * 
		 * 
		 * NavegadorNaInternet laptop = new Notebook();
		 * 
		 * laptop.acionarNovaAba(); laptop.atualizarPagina();
		 * laptop.exibirPagina("www.google.com");
		 */
		
		Iphone iphone = new Iphone();
		
		System.out.println("Navegando na internet");
		iphone.acionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina("www.google.com"); 
		
		
		System.out.println("-----------------------------");
		System.out.println("Telefone Celular");
		
		iphone.atender();
		iphone.ligar("9999-8888");
		iphone.iniciarCorreioVoz();
		
		System.out.println("-----------------------------");
		System.out.println("Reprodutor Musical");
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Rammstein");
		
		
		

	}

}
