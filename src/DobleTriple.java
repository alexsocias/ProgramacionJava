import java.util.Scanner;

public class DobleTriple {
    public static void main (String [] args ) {
        int num1;
        int resultado1;
        int resultado2;
        Scanner src=new Scanner(System.in);
        System.out.println("introduce un numero ");
        num1=src.nextInt();
        resultado1=(num1*2);
        resultado2=(num1*3);
        System.out.println("el primer resultado es" +resultado1);
        System.out.println("el segundo resultado es" +resultado2);


    }

}
