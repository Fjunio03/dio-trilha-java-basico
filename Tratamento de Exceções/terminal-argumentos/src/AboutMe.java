import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   
        }catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
    
}



/*
 * POSSIVEIS ERROS AO USUÁRIO DIGITAR
 * Não informar o nome e sobrenome;

O valor da idade ter um caractere NÃO numérico; (java.util.InputMismatchException)

O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano); (java.util.InputMismatchException)
 */

 // alguns erros descritos no readme.md