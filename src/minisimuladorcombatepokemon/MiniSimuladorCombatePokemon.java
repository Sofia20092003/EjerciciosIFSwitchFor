package minisimuladorcombatepokemon;

import java.util.Scanner;

public class MiniSimuladorCombatePokemon {
    public static void main(String[] args) {
        System.out.println("¡INICIA EL COMBATE ENTRE PIKACHU Y GENGAR!");
        System.out.println("------------------------------------------");
        int vidaPiKachu, ataquePikachu, vidaGengar, ataqueGengar,opcion;
        Scanner sc = new Scanner(System.in);
        vidaPiKachu=100;
        ataquePikachu= 55;
        vidaGengar=120;
        ataqueGengar=50;
        for (int i = 3 ; i >=0 ; i--) {
            System.out.println("Turno Restante: "+i);
            System.out.println("Pikachu ataca a Gengar. Vida de Gengar ahora es: " +(vidaGengar-=ataquePikachu));
            System.out.println("Gengar ataca a Pikachu. Vida de Pikachu ahora es: "+(vidaPiKachu-=ataqueGengar));
            if (vidaPiKachu<=0) {
                System.out.println("Pikachu se ha debilitado");
                break;
            }
            if (vidaGengar<=0) {
                System.out.println("Gengar se ha debilitado");
                break;
            }
            System.out.println("------------------------------------------");
        }
        System.out.println("------------------------------------------");
        System.out.println("¡Fin del combate!");
        if (vidaPiKachu>vidaGengar) {
            System.out.println("Pikachu ha ganado");
        } else if (vidaGengar>vidaPiKachu) {
            System.out.println("Gengar ha ganado");
        }else  if (vidaPiKachu==ataquePikachu) {
            System.out.println("Ha sido un empate.");
        }
    }
}
