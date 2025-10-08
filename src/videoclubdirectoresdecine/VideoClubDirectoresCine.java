package videoclubdirectoresdecine;

import java.util.Scanner;

public class VideoClubDirectoresCine {
    public static void main(String[] args) {
        String nombreautor, respuesta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge alguno de los siguientes directores:");
        System.out.println("1. Christopher Nolan");
        System.out.println("2. Quentin Tarantino");
        System.out.println("3. Guillermo del Toro");
        nombreautor = sc.nextLine();
        switch (nombreautor){
            case "Christopher Nolan":
                System.out.println("De este director te recomiendo: Inception");
                System.out.println("Te gusta la ciencia ficcion? (si/no) ");
                respuesta = sc.nextLine();
                if(respuesta.equals("si")) {
                    System.out.println("¡Genial! Disfrutaras de sus mundos complejos.");
                }else {
                    System.out.println("Quizas prefieras su pelicula 'The Dark Knight', que es mas de accion.");
                }
                break;
                case "Quentin Tarantino":
                    System.out.println("De este director te recomiendo: 'Pulp Fiction'");
                    System.out.println("Te gustan los dialogos ingeniosos? (si/no) ");
                    respuesta = sc.nextLine();
                    if(respuesta.equals("si")) {
                        System.out.println("¡Perfecto! Te encantara el guion.");
                    }else {
                        System.out.println("No te preocupes, la accion y la trama tambien son excelentes.");
                    }
                    break;
                    case "Guillermo del Toro":
                        System.out.println("De este director te recomiendo: 'El Laberinto del Fauno'");
                        System.out.println("Te gustan las historias de fantasia orscura? (si/no) ");
                        respuesta = sc.nextLine();
                        if(respuesta.equals("si")) {
                            System.out.println("Te sumergiras en un mundo magico e inolvidable.");
                        }else {
                            System.out.println("Podrias probar con 'Pacific Rim' para una doisis de accion con monstruos" +
                                    " gigantes.");
                        }
                        break;
                        default:
                            System.out.println("Director no encontrado en nuestra base de datos.");
        }
    }
}
