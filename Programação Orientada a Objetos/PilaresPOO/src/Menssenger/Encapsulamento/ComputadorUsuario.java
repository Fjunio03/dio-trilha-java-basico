package Menssenger.Encapsulamento;

public class ComputadorUsuario {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		//encapsular é somente esconder, os métodos ainda faram a sua função normalmente
		
		msn.receberMensagem();
		
	}
}
