public class ExemploBreakContinue {
    public static void main(String[] args) throws Exception {
        for(int numero = 1; numero <=5 ; numero++){
            if(numero == 3)
            break;//ou continue;
            //no caso do continue, o numero 3 não será imprimido. Ele imprimirá somente 1, 2 ,4 e 5

            System.out.println(numero);
        }
    }
}
