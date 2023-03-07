public class Tiempo extends Empleados{
    private int hora;
    private double pago;
    
    
    public Tiempo(String nombre,int hora,double pago) {
        super(nombre);
        this.hora = hora;
        this.pago = pago;
    }
    
    public double calcularPago(){
      return(hora*pago);
    }
     public String toString(){
       return "por tiempo: "+super.toString();
     }
}
