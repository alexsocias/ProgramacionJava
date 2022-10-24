import java.util.Scanner;

public class MetrosSegundos {
    public static void main (String [] args ) {
        double num1;
        double velocidadms;
        Scanner src=new Scanner(System.in);
        System.out.println("escribe la velocidad en km/h");
        num1= src.nextInt();
        velocidadms=(num1 /3.6);
        System.out.println("La velocidad en metros/segundo es "+velocidadms+" m/s");

    }
}
