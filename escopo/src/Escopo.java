public class Escopo {
    public static void main(String[] args) throws Exception {
        
    }

    public class Conta {
        //variavel da classe conta
        double saldo=10.0;
        
    public void sacar(Double valor) {
        //variavel local de método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        double novoSaldo = 0; //teria que criar uma outra variável dentro do método para o código funcionar direito, ou mudar a variavel "novoSaldo" para a class "Conta"
        //disponível em toda classe, pois está na class "Conta"
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
        System.out.println(novoSaldo);
        }

    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável com valor zero
        for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
            //esta variável será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;}
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis fora do for
            
        return valorMontante;
        }
    }
}
