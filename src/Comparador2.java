import java.io.IOException;

public class Comparador2 {
    public static void main(String[] args) throws IOException {
        System.out.println("escribe un caracter");
        char car1, car2;
        car1 = (char) System.in.read();
        System.in.read();
        car2 = (char) System.in.read();
        if (car1==car2) {
            System.out.println("los caracteres coinciden");
        } else {
            System.out.println("los carcteres no coinciden");
        }
    }
}
