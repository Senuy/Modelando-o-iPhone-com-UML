package aparelhos.reprodutorMusical;

public class Ipod implements ReprodutorMusical {


	public void tocar() {
		System.out.println("tocando via ipod");
	}


	public void pausar() {
		System.out.println("pausando  via ipod");
	}


	public void selecionarMusica(String musica) {
		System.out.println("selecionando: " + musica + " via ipod");
	}

}
