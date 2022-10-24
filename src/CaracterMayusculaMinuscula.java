import java.io.IOException;
import java.util.Scanner;

public class CaracterMayusculaMinuscula {
    public static void main(String[] args) throws IOException {
        System.out.println("Escribe una letra");
        char car1;
        car1 = (char)System.in.read();
        if (Character.isUpperCase(car1)) {
        System.out.println("Es mayuscula");
    }
        else {
            System.out.println("Es minuscula");
        }
   }
}

