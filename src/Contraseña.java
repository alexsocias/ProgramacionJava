import java.sql.SQLOutput;
import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String pasword="casablanca";
        String contraseña;
        boolean comprobacion=false;
        int contador, intentos=3;
        for (contador=0;contador<intentos&&!comprobacion;contador++){
            System.out.println("escribe la contraseña");
            contraseña=src.next();
            if (pasword.equals(contraseña)){
                System.out.println("contraseña correcta");
                comprobacion=true;
            }
        }

    }
}
