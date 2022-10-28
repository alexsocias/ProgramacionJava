import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        final int TAMANO=10;
        int lista[]=new int [TAMANO];
        Scanner src=new Scanner(System.in);
        //cargamos el array con los datos del usuario
        for (int i=0;i<lista.length;i++){
            System.out.println("introduce un numero");
            String texto= src.next();
            lista [i]=Integer.parseInt(texto);//convierte el string a entero
        }
        //mostramos los datos
        for (int j=0;j<lista.length; j++){
            System.out.println("en el indice "+j+" contiene el valor "+lista[j]);
        }
    }
}
