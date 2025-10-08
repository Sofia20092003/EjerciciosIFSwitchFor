package verificadordevelocidad;

import java.util.Scanner;

public class VerificadordeVelocidad {
    public static void main(String[] args) {
        int velocidadcoche;
        boolean esexcesovelocidadv=true;
        boolean esexcesovelocidadf=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la velocidad actual de su vehiculo(km/h):");
        velocidadcoche = sc.nextInt();
        if (velocidadcoche>120) {
            System.out.println(esexcesovelocidadv);
            System.out.println("¡Atención! Vas en una velocidad excesiva. ¡Riesgo de Multa!");
        }else  {
            System.out.println(esexcesovelocidadf);
            System.out.println("Velocidad adecuada. ¡Sigue asi y conduce con seguridad!");
        }
    }
}
