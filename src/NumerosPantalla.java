import java.sql.SQLOutput;
import java.util.Scanner;

public class NumerosPantalla {
    public static void main (String [] args ) {
        int num1, num2;
        Scanner src=new Scanner(System.in);
        System.out.println("introduce un numero");
        num1=src.nextInt();
        System.out.println("introduce otro numero");
        num2=src.nextInt();
        System.out.println("Los valores introducidos son"+num1+ "y" +num2);

    }
}
