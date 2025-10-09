package adivinaelactor;

import java.util.Scanner;

public class AdivinaElActor {
    public static void main(String[] args) {
        String pelicula1, pelicula2, actor, inentoAdivinar;
        Scanner sc = new Scanner(System.in);
        pelicula1="Indiana Jones";
        pelicula2="La Ultima Cruzada";
        actor="Harrison Ford";
        boolean haAdivinado=false;
        System.out.println("Intenta adivinar el actor, tienes tres intentos.");
        System.out.println("------------------------------------------------");
        System.out.println("Pista: Dos de sus peliculas más famosas en donde " +
                "fue el protagonista son: "+pelicula1+ " y " + pelicula2);
        System.out.println("------------------------------------------------");
        for (int i=3; i>=1; i--){
            System.out.println("Te quedan "+i+ " intentos");
            System.out.println("Escribe el nombre del actor que crees que es: ");
            inentoAdivinar = sc.nextLine();
            if (inentoAdivinar.equalsIgnoreCase(actor)){
                haAdivinado=true;
                System.out.println("¡" +haAdivinado+"!"+" ¡Has adivinado el actor!");
                break;
            }else {
                System.out.println("¡"+haAdivinado+"! Intentalo de nuevo.");
            }
            System.out.println("------------------------------------------------");
            if(i==1){
                System.out.println("Se te han acabado las oportunidades.");
                break;
            }
        }
    }
}
