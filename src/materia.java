public class materia {
    private String codigo;
    private String nombreMateria;
    private int credito;
    private double calif;

    //Constructores de la clase
    public materia(){
        setCodigo("");
        setNombreMateria("");
        setCredito(0);
        
    }
    
    public materia(String codigo, String nombreMateria, int credito) {
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.credito = credito;
    }

    //Getters
    public String getCodigo(){ 
        return codigo; 
    }
    public String getNombreMateria(){ 
        return nombreMateria; 
    }
    public int getCredito(){ 
        return credito; 
    }
    public double getCalificacion(){
        return calif;
    }

    //Setters
    public void setCodigo(String codigo){ 
        this.codigo = codigo; 
    }
    public void setNombreMateria(String nombreMateria){ 
        this.nombreMateria = nombreMateria; 
    }
    public void setCredito(int credito){ 
        this.credito = credito; 
    }
    public void setCalificaciones(double calif){
        this.calif = calif;
    }

    public String obtenerInformacion() {
        return "|Código: " + getCodigo() + "\n| Nombre: " + getNombreMateria() + "\n| Créditos: " + getCredito();
    }
}