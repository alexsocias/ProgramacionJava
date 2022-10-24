import java.util.Scanner;

public class NotaValor {
    public static void main(String[] args) {

        Scanner src=new Scanner(System.in);
        int nota;
        System.out.println("introduza la nota");
        nota=src.nextInt();
        switch (nota){
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable bajo");
                break;
            case 8:
                System.out.println("Notable alto");
                break;
            case 9:
                System.out.println("Escelente");
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;  


        }
    }
}
