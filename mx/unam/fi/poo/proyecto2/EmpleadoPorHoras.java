package mx.unam.fi.poo.proyecto2;
public class EmpleadoPorHoras extends Empleado{
    private final double salario; 
    private final int horas;

    public EmpleadoPorHoras(String nombre,String apellidoPaterno,int nSeguro,double salario,int horas){
        super(nombre,apellidoPaterno,nSeguro); 
        if(salario<0){
            this.salario=0;
        }
        else{
            this.salario=salario;
        }
        if(horas<0){
            this.horas=0;
        }
        else if(horas>180){
            this.horas=180;
        }
        else {
            this.horas=horas;
        }
    }

    public double getSalario(){
        return this.salario;
    }
    public double getHoras(){
        return this.horas;
    }

    @Override
    public double ingresos(){
        return getSalario()*getHoras();

    }
    @Override
    public String toString(){
        String valor="nombre: "+getNombre()+"\n";
        valor+="apellido paterno: "+getApellidoPaterno()+"\n";
        valor+="Número de Seguridad: "+getnSeguro()+"\n";
        valor+="Salario: "+getSalario()+"\n";
        valor+="Horas: "+getHoras()+"\n";
        //valor+="ingreso: "+ingresos();
        return valor;
    }



    


}
