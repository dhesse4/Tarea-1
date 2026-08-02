public class Localidades 
{
    private String nombre;
    private Integer costo;
    private Integer cantidad;

    public Localidades
    (String nombre,
     Integer costo,
     Integer cantidad
    )
    {
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Integer getCosto()
    {
        return this.costo;
    }
    public void setCosto(Integer costo)
    {
        this.costo = costo;
    }

    public Integer getCantidad()
    {
        return this.cantidad;
    }
    public void setCantidad(Integer cantidad)
    {
        this.cantidad = cantidad;
    }
}
