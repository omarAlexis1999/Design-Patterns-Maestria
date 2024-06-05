package unl.view;

import unl.decorator.IPersona;
import unl.decorator.ResponsableDeLaboratorio;
import unl.decorator.TutorDeEstudiante;
import unl.factory.PersonaFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Seleccione el tipo de persona a crear:");
            System.out.println("1. Estudiante");
            System.out.println("2. Docente");
            System.out.println("3. Administrativo");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            if (opcion == 4) {
                break;
            }

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el DUI: ");
            String dui = scanner.nextLine();
            System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
            String fechaStr = scanner.nextLine();
            Date fechaNacimiento = sdf.parse(fechaStr);
            String extraInfo = "";

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nivel socio económico (HIGH, MEDIUM, LOW): ");
                    extraInfo = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Ingrese el título académico: ");
                    extraInfo = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Ingrese el cargo: ");
                    extraInfo = scanner.nextLine();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            IPersona persona = PersonaFactory.crearPersona(
                    opcion == 1 ? "estudiante" :
                            opcion == 2 ? "docente" :
                                    opcion == 3 ? "administrativo" : "",
                    nombre, apellido, dui, fechaNacimiento, extraInfo
            );

            System.out.println("Persona creada:");
            System.out.println("------------------------------");
            System.out.println(persona.toString());
            System.out.println("------------------------------");
            persona.realizarActividad();

            // Aplicando Decorators
            System.out.println("Desea agregar una responsabilidad adicional?");
            System.out.println("1. Sí");
            System.out.println("2. No");

            int opcionDeco = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            if (opcionDeco == 1) {
                System.out.println("Seleccione la responsabilidad adicional:");
                System.out.println("1. Responsable de Laboratorio");
                System.out.println("2. Tutor de Estudiante");

                int deco = scanner.nextInt();
                scanner.nextLine();  // Consumir nueva línea

                switch (deco) {
                    case 1:
                        persona = new ResponsableDeLaboratorio(persona);
                        break;
                    case 2:
                        persona = new TutorDeEstudiante(persona);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        continue;
                }
            }

            System.out.println("Persona con responsabilidad adicional:");
            persona.realizarActividad();
        }

        scanner.close();
    }
}