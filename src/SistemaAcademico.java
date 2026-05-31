import java.util.*;

public class SistemaAcademico {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
    private static ArrayList<Profesores> listaProfesores = new ArrayList<>();
    private static ArrayList<materia> listaMaterias = new ArrayList<>();

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
        String codigo = sc.nextLine();
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

    // 4. Asignar materia
    public static void AsignarMateria(){
        System.out.println("--- ASIGNAR UNA MATERIA ---\n");
        System.out.print("Ingrese la matricula del estudiante: ");
        String Matricula = sc.nextLine();

        Estudiantes estudiantes = null; 
        for(Estudiantes est : listaEstudiantes){
            if(est.getMatricula().equalsIgnoreCase(Matricula)){

                estudiantes = est;
                break;
            }
        }

        if(estudiantes == null){
            System.out.println("ESTUDIANTE NO ENCOTNRADO.");
            return;
        }

        System.out.print("Ingrese el codigo de la materia: ");
        String codigo = sc.nextLine();

        materia Materias = null;
        for(materia mat : listaMaterias){
            if(mat.getCodigo().equalsIgnoreCase(codigo)){
                Materias = mat;
                break;
            }
        }

        if(Materias == null){
            System.out.println("MATERIA NO ENCONTRADA.");
            return;
        }

        estudiantes.getMaterias().add(Materias);
        System.out.println("MATERIA ASIGNADA.");
    } 

    // 5. Registrar calificaciones

    public static void RegistrarCalif(){
        System.out.println("--- REGISTRAR CALIFICACIONES ---\n");
        System.out.print("Ingrese la matricula del estuddiante: ");
        String Matricula = sc.nextLine();

        Estudiantes estudiantes = null;
        for(Estudiantes est : listaEstudiantes){
            if(est.getMatricula().equalsIgnoreCase(Matricula)){
                estudiantes = est;
            }
        }

        if(estudiantes == null){
            System.out.println("ESTUDIANTE NO ENCOTNRADO...");
            return;
        }

        System.out.print("Ingrese el codigo de la Asignartura / materia: ");
        String codigo = sc.nextLine();
        for(materia mat : estudiantes.getMaterias()){
            if(mat.getCodigo().equalsIgnoreCase(codigo)){
                System.out.print("Ingrese la calificacion del estudiante: ");
                double calif = sc.nextDouble();
                sc.nextLine();

                mat.setCalificaciones(calif);

                System.out.println("SU CALIFICACION FUE REGISTRADA CON EXITO! :)...");
                return;
            }
        }
        System.out.println("SU CALIFICACION NO FUE REGISTRADA CON EXITO! :(...");
    }

    // 6. Mostrar estudiantes
    public static void mostrarEstudiantes() {
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        if (listaEstudiantes.isEmpty()) {
            System.out.println("NO HAY ESTUDIANTES REGISTRADOS.");
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
            System.out.println("NO HAY MATERIAS REGISTRADAS.");
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
            System.out.println("NO HAY PROFESORES REGISTRADOS.");
            return;
        }
        for (Profesores p : listaProfesores) {
            System.out.println(p.obtenerInformacion());
        }
    }

    // 9. Mostrar reporte de promedios

    public static void MostrarReportePromedio(){
        if(listaEstudiantes.isEmpty()){
            System.out.println("NO HAY ESTUDIANTES REGISTRADOS...");
            return;
        }

        System.out.println("\n--- REPORTE DE PROMEDIOS ---");
        for(Estudiantes est : listaEstudiantes){
            System.out.println("\n=================================================");
            System.out.println("Estudiante: "+ est.getNombre() + " " + est.getApellido());
            System.out.println("===================================================");
            System.out.printf("%-25s %s%n","Materia", "Calificación");

            double Suma = 0;
            int TotalCreditos = 0;

            for (materia mat : est.getMaterias()) {
                System.out.printf("%-25s %.2f%n", mat.getNombreMateria(), mat.getCalificacion());

                Suma += mat.getCalificacion() * mat.getCredito();
                TotalCreditos += mat.getCredito();
            }
            double promedio = 0;
            if(TotalCreditos > 0){
                promedio = Suma / TotalCreditos;
            }
            System.out.println("|| =============================================== ||");
            System.out.printf("El promedio es: %.2f%n", promedio);

            if(promedio >= 70){
                System.out.println("Usted esta: Aprobado");
                
            }else{
                System.out.println("Usted esta: Reprobado");
            }
        }
    }
}