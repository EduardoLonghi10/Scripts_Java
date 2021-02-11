package exercicios;
import java.util.Scanner;
public class Exercicio_9 {
    public static void main(String[] args) {
       
        int pedido ;  
  
        System.out.println( "========== Barraca de Lanches ==========" ) ;  
        System.out.println( "Menu de lanches: " ) ;  
        System.out.println( "1 - X-Bacon" ) ;  
        System.out.println( "2 - X-Salada" ) ;  
        System.out.println( "3 - X-Picanha" ) ;  
        System.out.println( "4 - X-Tudo: Preço" ) ;  
  
        Scanner captura = new Scanner( System.in ) ;  
        System.out.println( "Digite o número do seu lanche: " ) ;  
        pedido = captura.nextInt( ) ;  
  
        switch ( pedido ) {  
            case 1:  
                System.out.println( "Você escolheu X-Bacon" ) ;  
                System.out.println( "O preço do X-Bacon é: R$ 20" ) ;  
                break ;  
            case 2:  
                System.out.println( "Você escolheu X-Salada" ) ;  
                System.out.println( "O preço do X-Salada é: R$ 15" ) ;  
                break ;  
            case 3:  
                System.out.println( "Você escolheu X-Picanha" ) ;  
                System.out.println( "O preço do X-Picanha é: R$ 22" ) ;  
                break ;  
            case 4:  
                System.out.println( "Você escolheu X-Tudo" ) ;  
                System.out.println( "O preço do X-Tudo é: R$ 30" ) ;  
                break ;  
            default:  
                System.out.println( "Erro! Número não existe no menu!" ) ;  
                break ;  
        }  
    }  
  
}  




