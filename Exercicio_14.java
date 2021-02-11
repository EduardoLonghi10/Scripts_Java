package exercicios;
import java.util.Scanner;
public class Exercicio_14 {
    public static void main(String[] args) { 
        Scanner entrada =  new  Scanner ( System.in);
        int  PrimeiroNumero , SegundoNumero ;

      	System.out.println("Verificador de números ");
        System.out.println("Digite o primeiro número: ");
        PrimeiroNumero  = entrada.nextInt ();

        System.out.println("Digite o segundo número:  ");
        SegundoNumero  = entrada.nextInt ();
        if ( PrimeiroNumero  >  SegundoNumero ) {
        System.out.println( " O primeiro número é maior que o segundo número. " );
        } else  if ( PrimeiroNumero  < SegundoNumero ) {
        System.out.println( " O primeiro número é menor que o segundo número. " );
        } else {
          System.out.println( " Os dois números são iguais. " );
        }

    }
}








