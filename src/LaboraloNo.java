import java.util.Scanner;

public class LaboraloNo {
    public static void main(String[] args) {
        System.out.println("introduce un numero de la semana ");
        int dia;
        Scanner src = new Scanner(System.in);
        dia = src.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes es laboral");
                break;
            case 2:
                System.out.println("Martes es laboral");
                break;
            default:
                System.out.println("no");
        }
    }
}
