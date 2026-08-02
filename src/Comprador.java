public class Comprador 
{
    private String nombre;
    private String correo;
    private Integer boletosComprar;  
    private Integer presupuesto;
    
    public Comprador
    (String nombre,
    String correo,
    Integer boletosComprar,
    Integer presupuesto
    )
    {
        this.nombre = nombre;
        this.correo = correo;
        this.boletosComprar = boletosComprar;
        this.presupuesto = presupuesto;
    }

    public String getNombre()
    {
        return this.nombre;
    }   
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCorreo()
    {
        return this.correo;
    }   
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public Integer getBoletosComprar()
    {
        return this.boletosComprar;
    }
    public void setBoletosComprar(Integer boletosComprar)
    {
        this.boletosComprar = boletosComprar;
    }

    public Integer getPresupuesto()
    {
        return this.presupuesto;
    }
    public void setPresupuesto(Integer presupuesto)
    {
        this.presupuesto = presupuesto;
    }

    public void mostrarInfo()
    {
        System.out.println("Información del comprador actual:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Correo: " + this.correo);
        System.out.println("Boletos a comprar: " + this.boletosComprar);
        System.out.println("Presupuesto: " + this.presupuesto);
    }
}
