import java.util.Scanner;

public class If_Else_If{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Informa a hora: ");
        hora = sc.nextInt();

        if (hora < 12){
        System.out.println("Bom Dia ! - primeira condição ");
        }
        else{
            if(hora > 12 && hora <18 ){
                System.out.println("Boa Tarde ! - segunda condição ");
            }else{
                if( hora > 18 ){
                System.out.println("Boa Noite ! - terceira condição ");
                }
            }
        }        
    }
}