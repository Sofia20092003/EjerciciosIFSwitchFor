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
        System.out.println("Pista 1: Dos de sus peliculas más famosas en donde " +
                "fue el protagonista son: "+pelicula1+ " y " + pelicula2);
        System.out.println("------------------------------------------------");
        System.out.println("Tienes 3 intentos");
        for (int i=1; i<=3; i++){
            System.out.println("Intento "+i+": ¿Quien es el actor?");
            inentoAdivinar = sc.nextLine();
            if (inentoAdivinar.equalsIgnoreCase(actor)){
                haAdivinado=true;
                System.out.println("¡Correcto! ¡Has adivinado! El actor era Harrison Ford.");
                break;
            } else if (i==1) {
                System.out.println("¡Incorrecto! Te quedan 2 intentos");
                System.out.println("------------------------------------------------");
                System.out.println("Pista 2: Su personaje a menudo lleva un sombrero y un latigo.");
                System.out.println("------------------------------------------------");
            } else if (i==2) {
                System.out.println("¡Incorrecto! Te queda 1 intento");
                System.out.println("------------------------------------------------");
                System.out.println("Pista 3: Tambien es famoso por pilotar el Hálcon Milenario en otra saga.");
                System.out.println("------------------------------------------------");
            }else if(i==3){
                System.out.println("¡Incorrecto! Se te han acabado las oportunidades.");
                break;
            }
        }
    }
}
