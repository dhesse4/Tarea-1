public class Libro 
{

    private String titulo;
    private String autor;
    private Integer paginas;
    private Double precio;

    public Libro
    (String titulo,
     String autor,
     Integer paginas,
     Double precio
    )
    {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precio = precio;
    }

    public Libro
    (
     String titulo,
     String autor
    )
    {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
        this.precio = 0.0;
    }

    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return this.autor;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public Integer getPaginas()
    {
        return this.paginas;
    }
    public void setPaginas(Integer paginas)
    {
        if(paginas < 0)
        {
            System.out.println("Valor de paginas invalido, porfavor ingresar un valor valido");
        }
        else this.paginas = paginas;
    }

    public Double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(Double precio)
    {
        if(precio < 0.0)
        {
            System.out.println("Precio invalido, porfavor ingresar un valor valido");     
        }
        else this.precio = precio;
    }

    public void aplicarDescuento(Double porcentaje)
    {
        Double descuento = this.precio * (porcentaje / 100);
        this.precio -= descuento;
    }

    public void aplicarDescuento(Double porcentaje, boolean redondeo)
    {
        if(redondeo)
        {
            Double descuento = this.precio * (porcentaje / 100);
            Math.round(this.precio -= descuento);   
        }
        else
        {
            aplicarDescuento(porcentaje);
        }
    }

    @Override
    public String toString() 
    {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + ", Precio: " + precio;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Libro)) return false;

        Libro libro = (Libro) obj;

        if (!titulo.equals(libro.titulo)) return false;
        return autor.equals(libro.autor);
    }
}

        

