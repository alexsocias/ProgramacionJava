import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        int operacion;
        //se puede poner un string en operacion
        double num1, num2;
        System.out.println("Elija que operacion quiere hacer 1)sumar 2)restar 3)multiplicar 4)dividr");
        Scanner src = new Scanner(System.in);
        operacion = src.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("introduza un numero");
                num1 = src.nextDouble();
                System.out.println("introduza otro numero");
                num2 = src.nextDouble();
                System.out.println("resultado" + (num1 + num2));
                break;
            case 2:
                System.out.println("introduza un numero");
                num1 = src.nextDouble();
                System.out.println("introduza otro numero");
                num2 = src.nextDouble();
                System.out.println("resultado" + (num1 - num2));
                break;
            case 3:
                System.out.println("introduza un numero");
                num1 = src.nextDouble();
                System.out.println("introduza otro numero");
                num2 = src.nextDouble();
                System.out.println("resultado" + (num1 * num2));
                break;
            case 4:
                System.out.println("introduza un numero");
                num1 = src.nextDouble();
                System.out.println("introduza otro numero");
                num2 = src.nextDouble();
                System.out.println("resultado" + (num1 / num2));

            default:
                System.out.println("ese numero no");

        }
    }
}
