package ExemploEnums;

public class SistemaIBGE {
	public static void main(String[] args) {
		for(EstadoBrasileiro uf: EstadoBrasileiro.values()) {
			System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.RIO_JANEIRO;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
		System.out.println(ufSelecionado.getIbge());
	}	
}
