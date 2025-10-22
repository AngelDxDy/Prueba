package mx.unam.fi.poo.proyecto2;


public class MainApp {
    public static void main(String[] args) {
        Empleado e= new EmpleadoAsalariado("angel","calva",32,100);
        System.out.println(e.toString());
        Empleado v= new EmpleadoPorHoras("raul","segura",32,100,50);
        System.out.println(v.toString());
    }
}
 