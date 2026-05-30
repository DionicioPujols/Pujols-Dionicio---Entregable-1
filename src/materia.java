public class materia {
    private int codigo;
    private String nombreMateria;
    private int credito;

    public materia(int codigo, String nombreMateria, int credito) {
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.credito = credito;
    }

    public int getCodigo(){ 
        return codigo; 
    }
    public String getNombreMateria(){ 
        return nombreMateria; 
    }
    public int getCredito(){ 
        return credito; 
    }
    
    public void setCodigo(int codigo){ 
        this.codigo = codigo; 
    }
    public void setNombreMateria(String nombreMateria){ 
        this.nombreMateria = nombreMateria; 
    }
    public void setCredito(int credito){ 
        this.credito = credito; 
    }
}