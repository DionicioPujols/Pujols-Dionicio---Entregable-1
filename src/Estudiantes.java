import java.util.*; 

public class Estudiantes extends Persona{
    private String Matricula;
    private int Edad;
    private String Carrera;
    private String FechaInscripcion;
    private ArrayList <materia> Materias;

    //Constructores de la clase;

    public Estudiantes(){
        super("", "");
        setMatricula("");
        setEdad(0);
        setCarrera("");
        setFechaInscripcion("");
        
        Materias = new ArrayList<>();
    }

    public Estudiantes(String Matricula, String nombre, String apellido, int Edad, String Carrera, String FechaInscripcion){
        super(nombre, apellido);
        setMatricula(Matricula);
        setEdad(Edad);
        setCarrera(Carrera);
        setFechaInscripcion(FechaInscripcion);
        Materias = new ArrayList<>();
    }

    //Getters;
    public String getMatricula(){
        return Matricula;
    }
    public int getEdad(){
        return Edad;
    }
    public String getCarrera(){
        return Carrera;
    }
    public String getFechaInscripcion(){
        return FechaInscripcion;
    }
    public ArrayList<materia> getMaterias() {
        return Materias;
    }
    
    //Setters;
    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }   
    public void setEdad(int Edad){
        this.Edad = Edad;
    }   
    public void setCarrera(String Carrera){
        this.Carrera = Carrera;
    }
    public void setFechaInscripcion(String FechaInscripcion){
        this.FechaInscripcion = FechaInscripcion;
    }

    public String MostrarInformacion(){
        return "\n| Matricula: " + getMatricula() + "\n| Nombre: " + getNombre() + "\n| Apellido:  " + getApellido() + "\n| Edad: " + getEdad() + "\n| Carrera: " + getCarrera() + "\n| Fecha de Inscripcion: " + getFechaInscripcion();    
    }
}
