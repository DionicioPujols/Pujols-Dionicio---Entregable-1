import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int opciones = 0;

        do{
            System.out.println("\n|| ----------------------------------- ||");
            System.out.println("||     SISTEMA DE GESTION ACADEMICO    ||");
            System.out.println("|| ----------------------------------- ||");
            System.out.println("|| 1. Registrar Estudiante             ||");
            System.out.println("|| 2. Registrar Profesor               ||");
            System.out.println("|| 3. Registrar Materia                ||");
            System.out.println("|| 4. Asignar materia a estudiante     ||");
            System.out.println("|| 5. Registrar calificacion           ||");
            System.out.println("|| 6. Mostrar estudiantes              ||");
            System.out.println("|| 7. Mostrar materias                 ||");
            System.out.println("|| 8. Mostrar profesores               ||");
            System.out.println("|| 9. Mostrar reporte de promedios     ||");
            System.out.println("|| 10. Salir                           ||");
            System.out.println("|| ----------------------------------- ||\n");

            System.out.print("INGRESE UN NUMERO DEL MENU INDICADO: ");
            if(sc.hasNextInt()){
                opciones = sc.nextInt();
                sc.nextLine(); 

                switch (opciones) {
                    case 1:
                        SistemaAcademico.registrarEstudiante();
                        break;
                    case 2:
                        SistemaAcademico.registrarProfesor(); 
                        break;
                    case 3:
                        SistemaAcademico.registrarMateria(); 
                        break;
                    case 4:
                        SistemaAcademico.AsignarMateria();
                        break;
                    case 5: 
                        SistemaAcademico.RegistrarCalif();
                        break;
                    case 6:
                        SistemaAcademico.mostrarEstudiantes(); 
                        break;
                    case 7: 
                        SistemaAcademico.mostrarMaterias(); 
                        break;
                    case 8:
                        SistemaAcademico.mostrarProfesores();
                        break;
                    case 9: 

                        break;
                    case 10: 
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opcion Invalida, inserte una opcion correcta...");
                        break;
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                sc.nextLine();
            }

        }while(opciones != 10);
    }
}