import java.util.Scanner;

public class OperacionAleatoriosArray {
    public static void main(String[] args) {
        int TAMANO;
        System.out.println("introduce el tamaño del array");
        Scanner src=new Scanner(System.in);
        TAMANO=src.nextInt();
        int[] lista=new int[TAMANO];
        int suma=0;
        int posicion=0;
        for (int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*10);
            suma=suma + lista[i];
        }
        for (int i=0;i< lista.length;i++){
            System.out.println("El valor de cada posicion es "+lista[i]);
        }
        System.out.println("el valor de la suma es "+suma);
    }
}
