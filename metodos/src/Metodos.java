public class Metodos {
    public static void main(String[] args) throws Exception {
        //Critérios para nomeação de métodos

        // Deve ser nomeado como verbo
        // Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra)

        //exemplos:
        somar(int n1, int n2){}

        abrirConexao(){}

        concluirProcessamento() {}

        findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

        calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade

    //_____________________________________________________________________
        //TODOS OS MÉTODOS DEVEM SEMPRE SER DEFINIDOS DENTRO DE UMA CLASSE
    //_____________________________________________________________________

        //Critérios para definição de métodos
        // Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

        //  Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não.

        // -_- CASO O MÉTODO NÃO RETORNE NENHUM VALOR, ELE SERÁ REPRESENTADO PELA PALAVRA-CHAVE 'void' -_-

        // Quais os parâmetros serão necessários para execução do método? Os métodos às vezes precisarão de argumentos como critérios para a execução.

        // O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.

        // Qual a visibilidade do método? Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.

        //Exemplos abaixo:
    }
    public static void MyClass {
	
        public double somar(int num1, int num2){
            //LOGICA - FINALIDADE DO MÉTODO
            return numSomado;
        }
        
        public void imprimir(String texto){
            //LOGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
        }
        // throws Exception : indica que o método ao ser utilizado poderá gerar uma exceção
        public double dividir(int dividendo, int divisor) throws Exception{}
        
        // este método não pode ser visto por outras classes no projeto
        private void metodoPrivado(){}
        
        //alguns equívocos estruturais
        public void validar(){
            //este método deveria retornar algum valor
            //no caso boolean (true ou false)
        }
        public void calcularEnviar(){
            //um método deve representar uma única responsabilidade
        }
        public void gravarCliente(String nome, String cpf, Integer telefone, ....){
            //este método tem a finalidade de gravar
            //informações de um cliente, por que não criar
            //um objeto cliente e passar como parâmetro ?
            //veja abaixo
        }
        public void gravarCliente(Cliente cliente){}
        //ou
        public void gravar(Cliente cliente){}

        // exemplo: exercicio Criando Uma TV
        
    }
}
