package exercicios;
import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
                double n1, n2, soma ;  
        Scanner captura = new Scanner( System.in ) ;  
   System.out.println( "Digite um número: " ) ;  
        n1 = captura.nextDouble( ) ;  
        System.out.println( "Digite outro número: " ) ;  
        n2 = captura.nextDouble( ) ;  
          
        soma = n1 + n2 ;  
          
        System.out.println( "A soma de "+n1+" + "+ n2 + " é: "+soma ) ;  
    }  
  
}  