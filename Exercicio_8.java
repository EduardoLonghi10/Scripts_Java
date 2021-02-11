package exercicios;
import java.util.Scanner;
public class Exercicio_8 {
    public static void main(String[] args) {
   int senhaMestre, senhaTentativa ;  
        double n1, n2, soma ;  
          
        Scanner captura = new Scanner( System.in ) ;  
          
        System.out.println( "Cadastre uma senha ( Apenas Números ): " ) ;  
        senhaMestre = captura.nextInt( ) ;  
          
        System.out.println( "Digite um número: " ) ;  
        n1 = captura.nextDouble( ) ;  
        System.out.println( "Digite outro número: " ) ;  
        n2 = captura.nextDouble( ) ;  
        soma = n1 + n2 ;  
          
        System.out.println( "Digite a sua senha para desbloquear a soma: " ) ;  
        senhaTentativa = captura.nextInt( ) ;  
          
        if( senhaTentativa == senhaMestre ){  
            System.out.println( "A soma é: "+soma ) ;  
        }else{  
            System.out.println( "Erro! Senha errada!" ) ;  
        }  
    }  
}  



