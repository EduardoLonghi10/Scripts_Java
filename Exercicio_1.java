package exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exercicio_1 {
    public static void main(String[] args) {
        double valorVeiculo, desconto, veiculoDesconto ;  
        int anoVeiculo, total2000 = 0, totalgeral = 0 ;  
        boolean continuar = true ;  
        String decisao ;  
  
        while ( continuar == true ) {  
            Scanner captura = new Scanner( System.in ) ;  
              
            System.out.println( "Digite o valor do veículo: " ) ;  
            valorVeiculo = captura.nextDouble( ) ;  
  
            System.out.println( "Digite o ano do veículo: " ) ;  
            anoVeiculo = captura.nextInt( ) ;  
     
            if ( anoVeiculo <= 2000) {  
                desconto = ( valorVeiculo * 12 ) / 100 ;  
                veiculoDesconto = valorVeiculo - desconto ;  
                System.out.println(   
                        "O desconto do veículo será de: " + desconto + ". O valor do carro será: " + veiculoDesconto ) ;  
                total2000++ ;  
            }  
            if ( anoVeiculo > 2000 ) {  
                desconto = ( valorVeiculo * 7 ) / 100 ;  
                veiculoDesconto = valorVeiculo - desconto ;  
                System.out.println(   
                        "O desconto do veículo será de: " + desconto + ". O valor do carro será: " + veiculoDesconto ) ;  
                totalgeral++ ;  
            }  
  
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;             
              
            if( decisao.equals( "s" ) ){  
                System.out.println( "Novo cálculo" ) ;  
            }else{  
                System.out.println( "Você saiu!" ) ;  
                continuar = false ;  
            }  
        }  
    }  
}  


