public class Persona {
    private String nombre;
    private String apellido;

    //Constructor de la clase;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getters;
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    //setters;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
