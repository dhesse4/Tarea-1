public class MainLibro 
{
    public static void main(String[] args) 
    {
        Libro libro1 = new Libro("Donda", "Kanye West");
        Libro libro2 = new Libro("La Divina comedia", "Dante Alighieri", 1000, 267.50);
        Libro libro3 = new Libro("El Quijote", "Miguel de Cervantes", 2000, 300.00);
        Libro libro4 = new Libro("Donda", "Kanye West");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        if (libro4.equals(libro1))
        {
            System.out.println("Los libros 1 y 4 son iguales");
            System.out.println(libro1);
            System.out.println(libro4);
        }

        if (libro2.equals(libro3))
        {
            System.out.println("Los libros 2 y 3 son iguales");
            System.out.println(libro2);
            System.out.println(libro3);
        }
        else System.out.println("Los libros 2 y 3 no son iguales");
        


    }   

}
