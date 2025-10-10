package menuinteractivopokedex;

import java.util.Scanner;

public class MenuInteractivoPokedex {
    public static void main(String[] args) {
        int opcion;
        String nombre;
        do {
            System.out.println("***Pokédex Interactiva***");
            System.out.println("1. Buscar Pókemon por nombre");
            System.out.println("2. Comparar estádisticas de Pókemon");
            System.out.println("3. Salir");
            System.out.println("Que opción escoges?");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuál es el nombre del Pokémon?");
                    System.out.println("1. Pikachu");
                    System.out.println("2. Mewtwo");
                    System.out.println("3. Gyarados");
                    Scanner sc2 = new Scanner(System.in);
                    nombre = sc2.nextLine();
                    switch (nombre) {
                        case "Pikachu":
                            System.out.println("--Ficha Pikachu--");
                            System.out.println("Tipo: Electrico");
                            System.out.println("Habilidad: Electrificación");
                            System.out.println("Descripcion: Pikachu, el Pokémon ratón. Puede generar ataques eléctricos" +
                                    " desde los coloretes eléctricos localizados en sus mejillas.");
                            System.out.println("*****************************************************************************************");
                            break;
                            case "Mewtwo":
                                System.out.println("--Ficha Mewtwo--");
                                System.out.println("Tipo: Psíquico");
                                System.out.println("Habilidad: Presión");
                                System.out.println("Descripcion: Creado por ingeniería genética. Su poder de combate es de un nivel" +
                                        " extraordinario.");
                                System.out.println("*****************************************************************************************");
                                break;
                                case "Gyarados":
                                    System.out.println("--Ficha Gyarados--");
                                    System.out.println("Tipo: Agua y Viento");
                                    System.out.println("Habilidad:  Este Pokémon tiene un temperamento muy cruel, por lo" +
                                            " que hay que tener extremo cuidado. Sus colmillos pueden partir piedras y sus " +
                                            "escamas son más duras que el acero.");
                                    System.out.println("*****************************************************************************************");
                                    break;
                        default:
                            System.out.println("Nombre de Pokémon no encontrado");
                            System.out.println("*****************************************************************************************");
                    }
                    break;
                    case 2:
                        int ataqueGroudon, defensaGroudon, ataqueKyogre, defensaKyogre;
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("---Comparativa Legendaria---");
                        System.out.println("Indica el valor del ataque de Groudon:");
                        ataqueGroudon = sc3.nextInt();
                        System.out.println("Indica el valor de la defensa de Groudon:");
                        defensaGroudon =  sc3.nextInt();
                        System.out.println("Indica el valor del ataque de Kyogre:");
                        ataqueKyogre =  sc3.nextInt();
                        System.out.println("Indica el valor de la defensa de Kyogre:");
                        defensaKyogre = sc3.nextInt();
                        if (ataqueGroudon > ataqueKyogre) {
                            System.out.println("Ataque: Groudon vs Kyogre. ¡Groudon tiene mayor ataque!");
                        } else if (ataqueKyogre>ataqueGroudon) {
                            System.out.println("Ataque: Groudon vs Kyogre. ¡Kyogre tiene mayor ataque!");
                        } else {
                            System.out.println("Ataque: Groudon vs Kyogre. ¡Tienen el mismo poder de ataque!");
                        }
                        if(defensaGroudon > defensaKyogre) {
                            System.out.println("Defensa: Groudon vs Kyogre. ¡Groudon es más resistente!");
                            System.out.println("*****************************************************************************************");
                        } else if (defensaKyogre>defensaGroudon) {
                            System.out.println("Defensa: Groudon vs Kyogre. ¡Kyogre es más resistente!");
                            System.out.println("*****************************************************************************************");
                        }else  {
                            System.out.println("Defensa: Groudon vs Kyogre. ¡Tienen la misma resistencia!");
                            System.out.println("*****************************************************************************************");
                        }break;
                        case 3:
                            System.out.println("Cerrando la Pokédex.....");
                            break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija de nuevo.");
            }
        }
        while (opcion!=3);
    }
}
