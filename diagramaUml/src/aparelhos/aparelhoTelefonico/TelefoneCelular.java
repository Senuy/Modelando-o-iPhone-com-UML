package aparelhos.aparelhoTelefonico;

public class TelefoneCelular implements AparelhoTelefonico {

	
	public void ligar(String numero) {
		System.out.println("ligando  para: "+numero+" ... discando");
	}

	
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Reproduzindo correio de voz");
		
	}

}
