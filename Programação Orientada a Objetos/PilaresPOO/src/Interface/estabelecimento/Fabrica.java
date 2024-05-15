package Interface.estabelecimento;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.digitalizadora.Scanner;
import Interface.equipamentos.impressora.Deskjet;
import Interface.equipamentos.impressora.Impressora;
import Interface.equipamentos.impressora.Laserjet;
import Interface.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Multifuncional em = new Multifuncional();//a multifuncional tem todas as funçoes pois implementa todas as opçoes
		
		Deskjet deskjet = new Deskjet();//essa opçao é somente uma impressora, somente a multifuncional terá todas as funções
		deskjet.imprimir();
		
		Laserjet laserjet = new Laserjet();
		laserjet.imprimir();
		
		Scanner scanner = new Scanner();//esse somente digitaliza
		scanner.digitalizar();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
