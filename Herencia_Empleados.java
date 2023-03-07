public class Herencia_Empleados {
    
    public static void main (String[] args){
        
      Empleados empleados;
      Empleado empleado;
      Tiempo tiempo;
      
      //creamos objetos
      empleados = new Empleados("cindy");
      empleado = new Empleado("marcela", 1.000);
      tiempo = new Tiempo("carlos" ,15, 1.500);
      
      //imprimimos 
      System.out.println(empleados);
      System.out.println(empleado);
      System.out.println(tiempo);
    }
}
