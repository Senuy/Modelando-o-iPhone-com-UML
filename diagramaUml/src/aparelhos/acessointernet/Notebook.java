package aparelhos.acessointernet;

public class Notebook implements NavegadorNaInternet {

	
	public void exibirPagina(String url) {
		System.out.println("Acessando: "+ url + " conectando");
		
	}

	
	public void acionarNovaAba() {
		System.out.println("Nova Aba");
		
	}


	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}
	
	

}
