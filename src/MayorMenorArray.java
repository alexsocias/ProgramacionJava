import java.util.Scanner;

public class MayorMenorArray {
    public static void main(String[] args) {
        final int TAMANO = 10;
        int lista[] = new int[TAMANO];
        int mayor=0, menor=0;
        int posicion1,posicion2;
        Scanner src=new Scanner(System.in);
        for (int i=0;i<lista.length;i++){
            System.out.println("introduce un numero");
            posicion1= src.nextInt();
            lista[i]=posicion1;

         if (lista[i]>mayor){
             mayor=lista[i];
         }
         if (lista[i]>posicion1){
             posicion1=lista[i];
         }
         if (lista[i]<menor){
             menor=lista[i];
         }
        }
        System.out.println("el mayor es "+mayor);
        System.out.println("el menor es "+menor);
    }
}
