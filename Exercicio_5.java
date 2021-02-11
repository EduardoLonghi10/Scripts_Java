package exercicios;
import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
  double n1, n2, soma, divisao, multiplicacao, subtracao ;  
        int operacao ;  
  
        Scanner captura = new Scanner( System.in ) ;  
  
        System.out.println( "========== Calculadora ========= " ) ;  
  
        System.out.println( "Digite um número: " ) ;  
        n1 = captura.nextDouble( ) ;  
        System.out.println( "Digite outro número: " ) ;  
        n2 = captura.nextDouble( ) ;  
  
        System.out.println( "Que operação deseja realizar ? " ) ;  
        System.out.println( "1 - Soma" ) ;  
        System.out.println( "2 - Subtracao" ) ;  
        System.out.println( "3 - Divisão" ) ;  
        System.out.println( "4 - Multiplicação" ) ;  
          
        System.out.print( "Digite um número da operação:" ) ;  
  
        operacao = captura.nextInt( ) ;  
  
        if ( operacao == 1 ) {  
            soma = n1 + n2 ;  
            System.out.println( "A soma é: " + soma ) ;  
        }  
        if ( operacao == 2 ) {  
            subtracao = n1 - n2 ;  
            System.out.println( "A subtração é: " + subtracao ) ;  
        }  
        if ( operacao == 3 ) {  
            divisao = n1 / n2 ;  
            System.out.println( "A divisão é: " + divisao ) ;  
        }  
        if ( operacao == 4 ) {  
            multiplicacao = n1 * n2 ;  
            System.out.println( "A soma é: " + multiplicacao ) ;  
        }  
    }  
}  





