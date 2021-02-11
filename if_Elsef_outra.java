import java.util.Scanner;

public class if_Elsef_outra{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Informa a hora: ");
        hora = sc.nextInt();

        if (hora < 12){
        System.out.println("Bom Dia ! - primeira condição ");
        }
        else if (hora < 18 ){
                System.out.println("Boa Tarde ! - segunda condição ");
            }else{
                System.out.println("Boa Noite ! - terceira condição ");
        }  
    }
}