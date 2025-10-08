package analizadorrendimientofutbolistas;

import java.util.Scanner;

public class AnalizadorRendimientoFutbolistas {
    public static void main(String[] args) {
        String nombrejugador;
        double totalgoles, numeropartidos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador: ");
        nombrejugador = sc.nextLine();
        System.out.println("Ingrese el numero de partidos jugados del jugador: ");
        numeropartidos = sc.nextInt();
        System.out.println("Ingrese el total de goles marcados por el  jugador: ");
        totalgoles = sc.nextInt();
        double goles = totalgoles / numeropartidos;
        if (numeropartidos==0){
            System.out.printf("No se puede evaluar el rendimiento sin haber jugado partidos.");
        }
        else if (goles>=0.8) {
            System.out.printf("El jugador " + nombrejugador + " tiene un promedio de " + goles + " goles por partido.");
            System.out.println("¡Rendimiento de bota de oro!");
        } else if (goles>=0.5 && goles<0.8) {
            System.out.printf("El jugador " + nombrejugador + " tiene un promedio de " + goles + " goles por partido.");
            System.out.println("Muy buen rendimiento. ¡Es un gran goleador!");
        } else if (goles<0.5 && goles<=0) {
            System.out.printf("El jugador " + nombrejugador + " tiene un promedio de " + goles + " goles por partido.");
            System.out.println("Necesita mejorar su promedio, pero sigue trabajando.");
        }
        else{
            System.out.printf("Algo salio mal. Digite los datos otra vez.");
        }
    }
}
