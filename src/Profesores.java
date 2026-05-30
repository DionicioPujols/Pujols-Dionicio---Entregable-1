public class Profesores extends Persona {
    private int codigo;
    private String especialidad;

    //Constructor de la clase
    public Profesores(int codigo, String nombre, String apellido, String especialidad) {
        super(nombre, apellido);
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    //Getters
    public int getCodigo(){ 
        return codigo; 
    }
    public String getEspecialidad(){ 
        return especialidad; 
    }
    
    //Setters
    public void setCodigo(int codigo){ 
        this.codigo = codigo; 
    }
    public void setEspecialidad(String especialidad){ 
        this.especialidad = especialidad; 
    }

    public String obtenerInformacion() {
        return "Codigo: " + codigo + " | Nombre: " + getNombre() + " " + getApellido() + " | Especialidad: " + especialidad;
    }
}