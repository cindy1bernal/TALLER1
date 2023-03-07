import java.util.Date;

public class Empleados {
   private String nombre;
   private String puesto;
   private String telefono;
   private Date fechaContrato;
   
   
   //contructor
   public Empleados(String nombre){
     this.nombre = nombre;
   
   }
   
   //encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
   
   
   
   @Override
   public String toString(){
       return nombre;       
   }
}
