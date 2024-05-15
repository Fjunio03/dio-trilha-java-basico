package Interface.equipamentos.multifuncional;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

	//multifuncional extends Impressora extends Digitalizadora == Erro
	//java nao permite uma herança multipla, somente uma
	//deve se criar a classes abstratas como interfaces
	
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo pela Multifuncional");
		
	}
	

	@Override
	public void digitalizar() {
		System.out.println("digitalizando pela Multifuncional");
		
	}

	@Override
	public void copiar() {
		System.out.println("copiando pela Multifuncional");
		
	}
	
	
}
