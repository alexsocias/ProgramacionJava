import java.util.Scanner;

public class SolucionMayorMenor {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int numero[] = new int[10];
        int minimo=Integer.MAX_VALUE;
        int maximo=Integer.MIN_VALUE;
        int posicionMax=0, posicionMin=0;
        System.out.println("introduce los 10 numeros");
        for (int i=0;i<numero.length;i++){
            numero[i]= src.nextInt();
            if (numero[i]<=minimo){
                minimo=numero[i];
                posicionMin=i+1;//se pone i+1 porq el usuario no suele poner 0, no sabe q la primera posicion es  0 y no 1
            }
            if (numero[i]>maximo){
                maximo=numero[i];
                posicionMax=i+1;
            }

        }
        System.out.println("el mayor numero es "+maximo+"y esta en la posición "+posicionMax);
        System.out.println("el menor numero es "+minimo+"y esta en la posición "+posicionMin);
    }
}