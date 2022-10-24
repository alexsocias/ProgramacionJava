import java.util.Scanner;

public class AreasFormas {
    public static void main (String [] args ) {
        int menu;
        Scanner src=new Scanner(System.in);
        double triangulo, cuadrado, pentagono;
        double baset, alturat;
        double ladoc;
        double perimetro, apotema;
        System.out.println("1)triangulo \n2)cuadrado \n3)pentagono");
        menu=src.nextInt();
        if (menu == 1) {
            System.out.println("introduzca la base");
            baset= src.nextDouble();
            System.out.println("introduzca la altura");
            alturat= src.nextDouble();
            triangulo= baset*alturat/2;
            System.out.println("El área del triangulo es"+triangulo+ "m2");

        }
        if (menu== 2) {
            System.out.println("introduza el tamaño de un lado");
            ladoc=src.nextDouble();
            cuadrado=ladoc*ladoc;
            System.out.println("El área del cuadrado es"+cuadrado+"m2");
        }
        if (menu== 3) {
            System.out.println("introduza el perimetro");
            perimetro= src.nextDouble();
            System.out.println("introduza la apotema");
            apotema= src.nextDouble();
            pentagono=perimetro*apotema/2;
            System.out.println("El área del pentagono es"+pentagono+"m2");
        }
        else {
            System.out.println("error");
        }
    }
}
