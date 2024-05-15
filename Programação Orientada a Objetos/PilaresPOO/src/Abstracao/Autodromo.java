package Abstracao;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		Moto z400 = new Moto();
		
		z400.ligar();
		jeep.ligar();
		
		Veiculo coringa = z400;
		
		coringa.ligar();
	}
}
