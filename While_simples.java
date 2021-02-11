import java.util.Scanner;

// Acumulando dados na Variavel e somando 

public class While_simples{
    public static void main(String[] args) {
//sistema deve ler numeros e quando digitar 0 ele pára e soma todos os numeros digitados
        System.out.println("Digite um Numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
// zero para começar a soma por zero sempre.
        int soma = 0; 

        while (n != 0 ) {
//salvar os dados digitados na variavel soma
//modo padrao
            soma = soma + n; 
        //soma += x; //nesse caso usando acumulador associativo
            n = sc.nextInt();           
        }
        System.out.println("O resultado da soma dos numeros digitados até o momento é: " + soma);
    }
} 