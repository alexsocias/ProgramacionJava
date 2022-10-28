import java.util.Scanner;

public class arrayFuncion {
    public static void main(String[] args) {
        final int TAMANO=10;
        int num[]=new int[TAMANO];
        rellenarArray(num);
        mostrarArray(num);
    }
    public static void rellenarArray(int lista[]){
        Scanner src=new Scanner(System.in);
        for (int i=0;i<lista.length;i++){
            System.out.println("introduce un numero");
            String texto= src.next();
            lista [i]=Integer.parseInt(texto);
        }
    }

    public static void mostrarArray(int lista[]){
        for (int i=0;i<lista.length;i++){
            System.out.println("en el indice "+i+" contiene el valor "+lista[i]);
        }
    }
}
