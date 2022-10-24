import java.io.IOException;
public class ComparadorMinus2 {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduzca una letra");
        car1 = (char) System.in.read();
        System.in.read();

        if (Character.isLowerCase(car1)) {
            System.out.println("su caracter es minuscula");

            System.out.println("Introduzca otra letra");
            car2 = (char) System.in.read();
            if (Character.isLowerCase(car2)){
                System.out.println("su caracter es minuscula");
            }
            else{
                System.out.println("su caracter es mayuscula");
            }
         }
         else{System.out.println("El primer caracter es mayuscula");
         }
    }
}