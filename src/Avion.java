public class Avion 
{
    private String modelo;
    private Integer capacidad;
    private Piloto piloto;

    public Avion() 
    {
        this.modelo = "";
        this.capacidad = 0;
        this.piloto = new Piloto();
    }

    public Avion(String modelo, Integer capacidad ) 
    {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.piloto = new Piloto();
    }

    public Avion(String modelo, Integer capacidad, Piloto piloto) 
    {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.piloto = piloto;
    }

    public String getModelo() 
    {
        return modelo;
    }
    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public Integer getCapacidad() 
    {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) 
    {
        this.capacidad = capacidad;
    }
    public void setCapacidad(Integer capacidad, Boolean vueloCarga)
    {
        if(vueloCarga)
        {
            this.capacidad = (int)(capacidad - (capacidad * 0.15));
        }
        else
        {
            this.capacidad = capacidad;
        }
    }

    public Piloto getPiloto() 
    {
        return piloto;
    }
    public void setPiloto(Piloto piloto) 
    {
        this.piloto = piloto;
    }

    @Override
    public String toString() 
    {
        return  "Datos del Avion\n" +
                "Modelo: " + modelo + "\n" +
                "Capacidad: " + capacidad + "\n" +
                piloto.toString() + "\n";
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Avion)) return false;

        Avion avion = (Avion) obj;

        if (!modelo.equals(avion.modelo)) return false;
        if (!capacidad.equals(avion.capacidad)) return false;
        return piloto.equals(avion.piloto);
    }
}
