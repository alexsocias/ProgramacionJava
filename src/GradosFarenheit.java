import java.util.Scanner;

public class GradosFarenheit {
    public static void main (String [] args ) {
        float num1;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        num1= src.nextFloat();
        System.out.println("La temperatura en Farenheit es" +(num1*1.8+32));

    }
}
