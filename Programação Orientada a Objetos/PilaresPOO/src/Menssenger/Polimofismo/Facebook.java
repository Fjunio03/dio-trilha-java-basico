package Menssenger.Polimofismo;

public class Facebook extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando dados Facebook");
		
	}

}
