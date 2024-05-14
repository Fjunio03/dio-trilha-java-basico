package EscolaExemploGetSet;

public class Escola {
	public static void main(String[] args) {
		//EXEMPLO DE GET E SET
		
		/*Aluno felipe = new Aluno();
		
		felipe.nome="Felipe";
		felipe.idade = 8;
		
		System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos */	
		
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
	
	}
}
