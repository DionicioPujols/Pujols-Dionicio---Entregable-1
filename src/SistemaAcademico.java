import java.util.*;

public class SistemaAcademico {
    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
    private static final ArrayList<Profesores> listaProfesores = new ArrayList<>();
    private static final ArrayList<materia> listaMaterias = new ArrayList<>();

    // 1. Registrar estudiante
    public static void registrarEstudiante() {
        System.out.println("--- REGISTRAR NUEVO ESTUDIANTE ---\n");
        System.out.print("Matricula: ");
        String Matricula = sc.nextLine();

        for(Estudiantes estudiante : listaEstudiantes){
            if(Matricula.equals(estudiante.getMatricula())){
                System.out.println("ESA MATRICULA YA ESTA REGISTRADA EN EL SISTEMA..."); 
                return;  
            }
        }
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Edad: ");
        int Edad = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Carrera: ");
        String Carrera = sc.nextLine();
        System.out.print("Fecha de Inscripcion: ");
        String FechaInscripcion = sc.nextLine();
        
        Estudiantes estudiante = new Estudiantes(Matricula, nombre, apellido, Edad, Carrera, FechaInscripcion);
        listaEstudiantes.add(estudiante);
        System.out.println("\nEL ESTUDIANTE FUE AGREGADO CON ÉXITO...\n");
    }

    // 2. Registrar profesor
    public static void registrarProfesor() {
        System.out.println("--- REGISTRAR NUEVO PROFESOR ---\n");
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine(); 

        for(Profesores profesor : listaProfesores){
            if(codigo == profesor.getCodigo()){
                System.out.println("ESTE CODIGO YA ESTA REGISTRADO EN EL SISTEMA..."); 
                return;  
            }
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();

        Profesores profe = new Profesores(codigo, nombre, apellido, especialidad);
        listaProfesores.add(profe);
        
        System.out.println("\nEL PROFESOR FUE AGREGADO CON ÉXITO...\n");
    }

    // 3. Registrar materia
    public static void registrarMateria() {
        System.out.println("--- REGISTRAR NUEVA MATERIA ---\n");
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nombre de la materia: ");
        String NombreMateria = sc.nextLine();
        System.out.print("Cantidad de creditos: ");
        int creditos = sc.nextInt();
        sc.nextLine(); 

        materia materias = new materia(codigo, NombreMateria, creditos);
        listaMaterias.add(materias); 

        System.out.println("\nLA MATERIA FUE AGREGADA CON ÉXITO...\n");
    }

    // 6. Mostrar estudiantes
    public static void mostrarEstudiantes() {
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        for (Estudiantes e : listaEstudiantes) {
            System.out.println(e.MostrarInformacion()); 
        }
    }

    // 7. Mostrar materias
    public static void mostrarMaterias() {
        System.out.println("\n--- LISTA DE MATERIAS ---");
        if (listaMaterias.isEmpty()) {
            System.out.println("No hay materias registradas.");
            return;
        }
        for (materia m : listaMaterias) { 
            System.out.println(m.obtenerInformacion());
        }
    }

    // 8. Mostrar profesores
    public static void mostrarProfesores() {
        System.out.println("\n--- LISTA DE PROFESORES ---");
        if (listaProfesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        for (Profesores p : listaProfesores) {
            System.out.println(p.obtenerInformacion());
        }
    }
}