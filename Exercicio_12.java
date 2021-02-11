package exercicios;
import java.util.Scanner;
public class Exercicio_12 {
    public static void main(String[] args) { 
        Scanner input =  new  Scanner ( System.in);
	double quantidade_minima ; 
        double quantidade_maxima;
        double estoque_medio;
	System.out.println("Calculadora de Estoque Médio");
	System.out.println("Digite a quantidade mímima: ");
	quantidade_minima = input.nextDouble ();
	
	System.out.println( " Digite a quantidade máxima: " );
	quantidade_maxima = input.nextDouble ();
	estoque_medio = (quantidade_minima + quantidade_maxima) /  2 ;
	System.out.println( " Estoque Médio = " + estoque_medio);
    }
}








