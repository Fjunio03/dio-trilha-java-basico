import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        double mesada = 50.0;

        while(mesada > 0){//repete ate que a mesada seja menor ou igual a 0
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)//verifica se o valor do doce é maior que o valor da mesada
                valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
                mesada = mesada - valorDoce;//subtrai o valor do doce da mesada
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
        //gera valor aleatório entre 2 e 8
    }
}
