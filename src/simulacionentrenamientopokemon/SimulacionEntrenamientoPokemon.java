package simulacionentrenamientopokemon;

import java.util.Scanner;

public class SimulacionEntrenamientoPokemon {
    public static void main(String[] args) {
        String nombrepokemon;
        int nivelpokemon, nivelesasubir, nivelfinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su pokemon");
        nombrepokemon = sc.nextLine();
        System.out.println("Ingrese el nivel actual de su pokemon");
        nivelpokemon = sc.nextInt();
        System.out.println("Cuantos niveles quiere subir?");
        nivelesasubir = sc.nextInt();
        nivelfinal = nivelesasubir+nivelpokemon;
        for(int i= nivelpokemon+1; i<=nivelfinal; i++){
            System.out.println("¡" +nombrepokemon+ " ha subido al nivel "+i);
            if(i==16 || i==36){
                String mensajeEvolucion= "¡Vaya! ¡" +nombrepokemon+ " esta evolucionando";
                System.out.println(mensajeEvolucion);
            }
        }
        System.out.println("¡Entrenamiento Finalizado! "+nombrepokemon+ " ahora esta en el nivel "+nivelfinal);
    }
}
