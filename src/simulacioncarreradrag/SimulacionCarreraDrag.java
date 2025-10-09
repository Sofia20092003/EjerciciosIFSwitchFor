package simulacioncarreradrag;

import java.util.Scanner;

public class SimulacionCarreraDrag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡COMIENZA LA CARRERA DE DRAG DE 400mts!");
        System.out.println("------------------------------------------------------------------");
        String coche1, coche2;
        coche1="Muscle Car";
        coche2="Deportivo Japonés";
        double velocidadactual, velocidadnueva1,aceleracionmuscle, aceleracuondeportivo, distanciaactual;
        double distancianueva1,velocidadnueva2, distancianueva2, meta;
        boolean carreraFinalizada=false;
        System.out.println("Cual es la aceleración (m/s2) del "+coche1+"?");
        aceleracionmuscle=sc.nextDouble();
        System.out.println("Cual es la aceleración (m/s2) del "+coche2+"?");
        aceleracuondeportivo=sc.nextDouble();
        meta=450;
        velocidadactual=0.0;
        distanciaactual=0.0;
        velocidadnueva1= velocidadactual+aceleracionmuscle;
        velocidadnueva2= velocidadactual+aceleracuondeportivo;
        distancianueva1= distanciaactual+velocidadnueva1;
        distancianueva2= distanciaactual+velocidadnueva2;
        for (int i=1; i<16; i++){
            System.out.println("Segundo " +i+ ":" +coche1+ " " +
                    "ha recorrido "+distancianueva1+ "m. | " +coche2+ " ha recorrido "+distancianueva2+"m" );
            velocidadnueva1+=velocidadnueva1/(i*i);
            velocidadnueva2+=velocidadnueva2/(i*i);
            distancianueva1+=velocidadnueva1;
            distancianueva2+=velocidadnueva2;
            boolean coche1cruzameta=distancianueva1>=meta;
            boolean coche2druzameta=distancianueva2>=meta;
            if (coche1cruzameta&&coche2druzameta){
                System.out.println("¡El "+coche1+" ha cruzado la meta!");
                System.out.println("¡El "+coche2+" ha cruzado la meta!");
                if(distancianueva1>distancianueva2){
                    System.out.println("¡FIN DE LA CARRERA! El "+coche1+" ha ganado la carrera.");
                }else {
                    System.out.println("¡FIN DE LA CARRERA! El "+coche2+" ha ganado la carrera.");
                }
                carreraFinalizada=true;
                break;
            } else if (coche1cruzameta) {
                System.out.println("¡El "+coche1+" ha cruzado la meta!");
                System.out.println("¡FIN DE LA CARRERA! El "+coche1+" ha ganado la carrera.");
                carreraFinalizada=true;
                break;
            }else if (coche2druzameta) {
                System.out.println("¡El "+coche2+" ha cruzado la meta!");
                System.out.println("¡FIN DE LA CARRERA! El "+coche2+" ha ganado la carrera.");
                carreraFinalizada=true;
                break;
            }
        }
        if(!carreraFinalizada){
            System.out.println("¡FIN DE LA CARRERA!");
            if (distancianueva1>distancianueva2){
                System.out.println("El "+coche1+ " es el ganador de la carrera.");
            }else {
                System.out.println("El "+coche2+ " es el ganador de la carrera.");
            }
        }
    }
}
