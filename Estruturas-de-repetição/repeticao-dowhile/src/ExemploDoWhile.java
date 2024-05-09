import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) throws Exception {
        System.out.println("Discando...");

        do{//repete ate alguem atender
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Aloô!!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; //randomiza a situaçao para ver se alguem atendeu ou não
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
