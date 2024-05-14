import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class AvaliandoCandidatos {
    public static void main(String[] args) throws Exception {
        // String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        // for(String candidato : candidatos){
        //     entrandoEmContato(candidato);}
        
        // analisarCandidato(1900.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2200.0);
        // selecaoCandidatos();
        // imprimirSelecionados();

        
    }


    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidadosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while( candidadosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidadosSelecionados++;
                
            }
            candidatosAtual++;
        }
    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }



    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("imprimeindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidatos de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    static boolean atender() {
		return new Random().nextInt(3)==1;
    }
    

}
