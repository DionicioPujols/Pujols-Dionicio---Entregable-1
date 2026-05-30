import java.util.*; 

public class Estudiantes extends Persona{
    private String Matricula;
    private int Edad;
    private String Carrera;
    private String FechaInscripcion;
    ArrayList<materia> materias = new ArrayList<>();

    //Constructor de la clase;
    public Estudiantes(String Matricula, String nombre, String apellido, int Edad, String Carrera, String FechaInscripcion){
        super(nombre, apellido);
        this.Matricula = Matricula;
        this.Edad = Edad;
        this.Carrera = Carrera;
        this.FechaInscripcion = FechaInscripcion;
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
        return "| Matricula: " + Matricula + "| Nombre: " + getNombre() + "| Apellido:  " + getApellido() + "| Edad: " + Edad + "| Carrera: " + Carrera;    
    }
}
