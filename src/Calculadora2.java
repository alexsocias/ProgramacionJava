import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double operando1, operando2, resultado=0;
        System.out.println("escribe el primer operando");
        operando1= sc.nextDouble();
        System.out.println("escribe el operador");
        String operacion=sc.next();
        System.out.println("escribe el segundo operando");
        operando2= sc.nextDouble();
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            default:
                System.out.println("error");
        }
        System.out.println(resultado);
    }
}
