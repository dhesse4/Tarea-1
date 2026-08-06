public class Piloto 
{
    private String nombre;
    private String licencia;
    private Integer horasVuelo;

    public Piloto() 
    {
        this.nombre = "";
        this.licencia = "";
        this.horasVuelo = 0;
    }

    public Piloto(String nombre, String licencia, Integer horasVuelo) 
    {
        this.nombre = nombre;
        this.licencia = licencia;
        this.horasVuelo = horasVuelo;
    }

    public Piloto(String nombre, String licencia) 
    {
        this.nombre = nombre;
        this.licencia = licencia;
        this.horasVuelo = 0;
    }

    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getLicencia() 
    {
        return licencia;
    }
    public void setLicencia(String licencia) 
    {
        this.licencia = licencia;
    }

    public Integer getHorasVuelo() 
    {
        return horasVuelo;
    }
    public void setHorasVuelo(Integer horasVuelo) 
    {
        this.horasVuelo = horasVuelo;
    }
    public void setHorasVuelo(Integer horasVuelo, Boolean acumular) 
    {
        if (acumular) {
            this.horasVuelo += horasVuelo;
        } else {
            this.horasVuelo = horasVuelo;
        }
    }

    @Override
    public String toString() 
    {
        return  "Datos del Piloto\n" +
                "Nombre: " + nombre + "\n" +
                "Licencia: " + licencia + "\n" +
                "Horas de Vuelo: " + horasVuelo + "\n";
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Piloto)) return false;

        Piloto piloto = (Piloto) obj;

        if (!nombre.equals(piloto.nombre)) return false;
        if (!licencia.equals(piloto.licencia)) return false;
        return horasVuelo.equals(piloto.horasVuelo);
    }
    
}
