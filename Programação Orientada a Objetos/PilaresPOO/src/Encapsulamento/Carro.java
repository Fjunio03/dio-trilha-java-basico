package Encapsulamento;

public class Carro {
	public void ligar() {
		conferirCombustível();
		conferinfoCambio();
		System.out.println("Carro ligado");
	}
	private void conferirCombustível() {
		System.out.println("Conferindo combustível");
	}
	private void conferinfoCambio() {
		System.out.println("Cambio em P");
	}
}
