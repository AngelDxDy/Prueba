package mx.unam.fi.poo.proyecto2;
public class EmpleadoAsalariado extends Empleado{
    private final double salarioSemanal; 
    public EmpleadoAsalariado(String nombre,String apellidoPaterno,int nSeguro,double salarioSemanal){
        super(nombre,apellidoPaterno,nSeguro); 
        if(salarioSemanal<0){
            this.salarioSemanal=0;
        }
        else{
            this.salarioSemanal=salarioSemanal;
        }
    }
    public double getSalario(){
        return this.salarioSemanal;
    }
    @Override
    public double ingresos(){
        return getSalario();
    }
    @Override
    public String toString(){
        String valor="nombre: "+getNombre()+"\n";
        valor+="apellido paterno: "+getApellidoPaterno()+"\n";
        valor+="Número de Seguridad: "+getnSeguro()+"\n";
        valor+="Salario: "+getSalario()+"\n";
        return valor;
    }
}