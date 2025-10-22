package mx.unam.fi.poo.proyecto2;

public abstract class Empleado{
    private final String nombre;
    private final String apellidoPaterno;
    private final int nSeguro;
    
    public Empleado(String nombre,String apellidoPaterno,int nSeguro){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.nSeguro=nSeguro;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public int getnSeguro() {
        return nSeguro;
    }
    
    public String getNombre() {
        return nombre;
    }
    

    public abstract double ingresos();
    public abstract String toString();

}