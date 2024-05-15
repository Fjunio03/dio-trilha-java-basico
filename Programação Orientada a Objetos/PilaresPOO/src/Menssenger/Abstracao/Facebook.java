package Menssenger.Abstracao;

public class Facebook extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		
	}

}
