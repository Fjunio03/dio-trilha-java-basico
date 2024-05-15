package Menssenger.Abstracao;

public class ComputadorUsuario {
	public static void main(String[] args) {
		MSNMenssenger msn = new MSNMenssenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Facebook fbm = new Facebook();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
