public class Operadores {
    public static void main(String[] args) throws Exception {

        //classe Operador de Atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

//----------------------------------------------------------------------

        //classe Operadores Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

//----------------------------------------------------------------------
        
        //classe Operadores Unários
        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //Imprimindo o numero negativo como positivo
        numero = numero * -1;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        //Negando expressões booleanas
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

    //----------------------------------------------------------------------

        // classe Operadores Ternários
        int a, b;

        a = 5;
        b = 6;
        String resultadoternario = ""; // pode-se usar outros tipos de variaveis, como o int

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        resultadoternario = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultadoternario);
        //Imprime falso pois as variáveis inteiras a e b não são iguais

    //----------------------------------------------------------------------
        //classe Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        if(numero1 == numero2)
            System.out.println("Numero 1 é igual ao numero 2");

    //----------------------------------------------------------------------

        // Operadores Lógicos
        boolean condicao1 = true;

        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */
        // && = Operador lógico "E"
        // || = Operador lógico "OU"
        // Atalho para o sinal '|' = Alt + 124


        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        // ComparacaoAvancada.java
        int numero__1 = 1;
        int numero__2 = 1;

        if(numero__1 == 2 & numero__2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero__1);
        System.out.println("O numero 2 agora é " + numero__2);

        
    }
    //usando o equals para comparar strings
    //recomendado se aprofundar no conceito de espaço em memória Stack versus Heap

    public static void UsandoEquals() {

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true
        System.out.println(nome3.equals(nome4)); //true
        
    //----------------------------------------------------------------------

        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        Integer numero_1 = 130;
        Integer numero_2 = 130;

        System.out.println(numero_1 == numero_2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(numero_1.equals(numero_2)); 

    }
}
