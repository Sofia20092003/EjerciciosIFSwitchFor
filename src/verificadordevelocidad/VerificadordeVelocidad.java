package verificadordevelocidad;

import java.util.Scanner;

public class VerificadordeVelocidad {
    public static void main(String[] args) {
        int velocidadcoche;
        boolean esexcesovelocidadf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la velocidad actual de su vehiculo(km/h):");
        velocidadcoche = sc.nextInt();
        if (velocidadcoche>120) {
            esexcesovelocidadf=true;
            System.out.println("¡Atención! Vas en una velocidad excesiva. ¡Riesgo de Multa!");
        }else  {
            esexcesovelocidadf=false;
            System.out.println("Velocidad adecuada. ¡Sigue asi y conduce con seguridad!");
        }
    }
}
