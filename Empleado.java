public class Empleado extends Empleados{
    
    private double sueldo;
    private double fondos;
    
    //metodo contructor
    public Empleado(String nombre,double sueldo) {
    //llamar al constructor de la clase padre
    super(nombre);
    this.sueldo = sueldo;
    this.fondos = 0.4 * sueldo;
    }
    
    public double calcularSueldo(){
      return(sueldo-fondos);
    }
    //poliformismo
    @Override
    public String toString(){
        return "Empleado: "+super.toString();
    }
}
