import java.util.Scanner;

public class SolucionArrayAleatorio {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in); //crear escaner
        System.out.println("tamaño array");//crear pregunta
        final int TAMANO=src.nextInt();//crear variable i introducir valor usuario
        int lista []=new int[TAMANO];//asignamos el tamaño al array
        int suma=0; //si no se inicializa da error
        for (int i=0;i< lista.length;i++){//el for es para que se vayan rellenando todos los datos de la lista aleatoriamente
            lista[i]=(int)Math.floor(Math.random()*10);//numero aleatorio hasta 10
            System.out.println("el valor es "+lista[i]);//imprime cada valor del array
            suma+=lista[i];//suma todo el array
            System.out.println("la posicion es "+(i+1)); //imprime la posicion, el i+1 es para q empieze en 1 y no fuera
        }
        System.out.println("la suma es "+suma); //fuera del for se hace la suma para q no se repita n veces
    }
}
