public class MainAeroValle {
    public static void main(String[] args) 
    {
        Piloto piloto1 = new Piloto("Rosa Gomez", "Comercial", 1500);
        Piloto piloto2 = new Piloto("Sofia de Leon", "Privada");

        Avion avion1 = new Avion("Boeing 727", 200, piloto1);
        Avion avion2 = new Avion("2026 Excel", 125, piloto2);

        System.out.println(avion1.toString());
        System.out.println(avion2.toString());

        piloto1.setHorasVuelo(600, true);
        piloto2.setHorasVuelo(50);

        avion1.setCapacidad(225);
        avion2.setCapacidad(175, true);

        System.out.println(avion1.toString());
        System.out.println(avion2.toString());

        Avion avion3 = new Avion("Fly Emirates 10", 200, piloto1);
        Avion avion4 = new Avion("Fly Emirates 10", 200, piloto1);

        if(avion3.equals(avion4))
        {
            System.out.println("Los aviones 3 y 4 son iguales");
        }
        else
        {
            System.out.println("Los aviones 3 y 4 son diferentes");
        }

    }
}
