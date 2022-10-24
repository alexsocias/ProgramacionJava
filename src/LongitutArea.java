import java.util.Scanner;

public class LongitutArea {
    public static void main (String [] args ) {
        double num1,resultado1,resultado2;
        Scanner src=new Scanner(System.in);
        System.out.println("escribe el radio de una circunferencia");
        num1= src.nextInt();
        resultado1=(num1*2*Math.PI);
        resultado2=(Math.pow(num1,2)*Math.PI);
        System.out.println("la longitud es: " +resultado1);
        System.out.println("el area es: " +resultado2);
    }
}

