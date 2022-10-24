import java.util.Scanner;

public class EuroPeseta {
    public static void main (String [] args ) {
        int menu;
        Scanner src=new Scanner(System.in);
        double euros, pesetas;
        System.out.println("1) De euros a pesetas \n2) De pesetas a euros");
        menu= src.nextInt();
        if (menu==1) {
            System.out.println("introduce las pesetas a convertir");
            pesetas = src.nextDouble();
            euros = pesetas / 166.386;
            System.out.println("el total en euros es" + euros + "€");
        }
        if (menu==2) {
                System.out.println("introduce los euros a convertir");
                euros=src.nextDouble();
                pesetas=euros*166.386;
                System.out.println("el total en pesetas es"+pesetas+"pts");
            }
       }




    }

