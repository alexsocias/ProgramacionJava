import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        final int TAMANO = 5;
        int lista[] = new int[TAMANO];
        int resultado=0;
        int valor;
        Scanner src=new Scanner(System.in);
        for (int i=0;i<lista.length;i++){
            System.out.println("introduce un numero");
            valor= src.nextInt();
            lista[i]=valor;
            resultado+=lista[i];
        }
        System.out.println("el resultado de la suma es "+resultado);
    }
}
