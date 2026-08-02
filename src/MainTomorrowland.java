import java.util.Random;
import java.util.Scanner;

public class MainTomorrowland 
{
    static int ganancias = 2750;
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Localidades localidad1 = new Localidades("VIP", 1000, 19);
        Localidades localidad2 = new Localidades("General", 100, 12);
        Localidades localidad3 = new Localidades("Preferencial", 500, 17);

        Comprador comprador1 = new Comprador("Juan Perez", "jper@gmail.com", 4, 1250);


        int eleccion = 0;
        while(eleccion != 7)
        {
            System.out.println("Bienvenido a la compra de boletos para Tomorrowland");
            System.out.println("1. Ingresar comprador");
            System.out.println("2. Participar por la compra de boletos");
            System.out.println("3. Mostrar disponibilidad general");
            System.out.println("4. Mostrar disponibilidad por localidad");
            System.out.println("5. Mostrar reporte de caja");
            System.out.println("6. Mostrar información del comprador");
            System.out.println("7. Salir del programa");
            System.out.print("Ingresa la accion que quieres realizar: ");
            eleccion = scanner.nextInt();

            if(eleccion == 1)
            {
                String nombre, correo;
                Integer boletos, presupuesto;
                System.out.print("Ingresa el nombre del comprador: ");
                nombre = scanner.next();
                scanner.nextLine();
                System.out.print("Ingresa el correo del comprador: ");
                correo = scanner.next();
                System.out.print("Ingresa el número de boletos que desea comprar: ");
                boletos = scanner.nextInt();
                System.out.print("Ingresa el presupuesto: ");
                presupuesto = scanner.nextInt();
                comprador1.setNombre(nombre);
                comprador1.setCorreo(correo);
                comprador1.setBoletosComprar(boletos);
                comprador1.setPresupuesto(presupuesto);
                System.out.println("Comprador actualizado con exito!!\n");
            }
            else if(eleccion == 2)
            {
                Boolean solicitud = solicitudBoletos();
                if(solicitud)
                {
                    venderBoletos(seleccionarLocalidad(), comprador1, localidad1, localidad2, localidad3);
                }
                else
                {
                    System.out.println("Que mal!! El comprador no fue seleccionado para la compra de boletos.\n");
                }
            }
            else if(eleccion == 3)
            {
                int boletosVendidosVIP = 20 - localidad1.getCantidad();
                int boletosVendidosGeneral = 20 - localidad2.getCantidad();
                int boletosVendidosPreferencial = 20 - localidad3.getCantidad();

                System.out.println("Disponibilidad general de boletos:");
                System.out.println("Boletos vendidos");
                System.out.println("Localidad VIP: " + boletosVendidosVIP);
                System.out.println("Localidad General: " + boletosVendidosGeneral); 
                System.out.println("Localidad Preferencial: " + boletosVendidosPreferencial+"\n");
                System.out.println("Boletos disponibles");
                System.out.println("Localidad VIP: " + localidad1.getCantidad());   
                System.out.println("Localidad General: " + localidad2.getCantidad());
                System.out.println("Localidad Preferencial: " + localidad3.getCantidad()+"\n");
            }
            else if(eleccion == 4)
            {
                String localidadElegida;
                System.out.print("Ingresa la localidad que deseas consultar: ");
                localidadElegida = scanner.next();

                if(localidadElegida.equalsIgnoreCase("vip")) System.out.print("La cantidad de asientos disponibles en la localidad VIP es: " + localidad1.getCantidad());
                else if(localidadElegida.equalsIgnoreCase("general")) System.out.print("La cantidad de asientos disponibles en la localidad General es: " + localidad2.getCantidad());
                else if(localidadElegida.equalsIgnoreCase("preferencial")) System.out.print("La cantidad de asientos disponibles en la localidad Preferencial es: " + localidad3.getCantidad());
                System.out.println("\n");

            }
            else if(eleccion == 5)
            {
                System.out.println("Reporte de caja:");
                System.out.println("Ganancias totales en ventas de boletos: " + ganancias);
                System.out.println("\n");
            }
            else if(eleccion == 6)
            {
                comprador1.mostrarInfo();
            }
        }

        scanner.close();
    }

    public static Boolean solicitudBoletos()
    {
        Boolean solicitudValida = false;

        Random random = new Random();
        int numeroComprador = random.nextInt(1500) + 1;
        int numero1 = random.nextInt(1500) + 1;
        int numero2 = random.nextInt(1500) + 1;

        int menor, mayor;

        if(numero1 < numero2)
        {
            menor = numero1;
            mayor = numero2;
        }
        else
        {
            menor = numero2;
            mayor = numero1;
        }

        if(numeroComprador > menor && numeroComprador < mayor)
        {
            solicitudValida = true;
        }

        return solicitudValida;
    }

    public static Integer seleccionarLocalidad()
    {
        int localidad = 0;

        Random random = new Random();

        localidad = random.nextInt(3) + 1;

        return localidad;
    }

    public static void venderBoletos(int localidad, Comprador comprador, Localidades localidad1, Localidades localidad2, Localidades localidad3)
    {
        Scanner scanner = new Scanner(System.in);
        Localidades localidadElegida;
        if(localidad == 1)
        {
            localidadElegida = localidad1;
            System.out.println("Localidad VIP seleccionada");
            int eleccion = 0;
            System.out.println("Desea continuar con la compra de boletos?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Ingresa una la accion que quieres realizar: ");
            eleccion = scanner.nextInt();
            if(eleccion == 2)
            {
                System.out.println("Compra cancelada\n");
                return;
            }
            else
            {
            validarVenta(localidadElegida, comprador);
            }
        }
        else if(localidad == 2)
        {
            localidadElegida = localidad2;
            System.out.println("Localidad General seleccionada");
            int eleccion = 0;
            System.out.println("Desea continuar con la compra de boletos?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Ingresa una la accion que quieres realizar: ");
            eleccion = scanner.nextInt();
            if(eleccion == 2)
            {
                System.out.println("Compra cancelada\n");
                return;
            }
            else
            {
                validarVenta(localidadElegida, comprador);
            }
        }
        else if(localidad == 3)
        {
            localidadElegida = localidad3;
            System.out.println("Localidad Preferencial seleccionada");
            int eleccion = 0;
            System.out.println("Desea continuar con la compra de boletos?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Ingresa una la accion que quieres realizar: ");
            eleccion = scanner.nextInt();
            if(eleccion == 2)
            {
                System.out.println("\nCompra cancelada\n");
                return;
            }
            else
            {
                validarVenta(localidadElegida, comprador);
            }
        }
    }

    public static void validarVenta(Localidades localidadElegida, Comprador comprador)
    {
        int costo;
        if(localidadElegida.getCantidad() == 0)
        {
            System.out.println("No hay boletos disponibles en esta localidad.\n");
        }
        else
        {
            if(comprador.getBoletosComprar() > localidadElegida.getCantidad())
            {
                System.out.println("No hay suficientes boletos disponibles en esta localidad, se venderan los boletos disponibles.\n");
                comprador.setBoletosComprar(localidadElegida.getCantidad());
                costo = comprador.getBoletosComprar() * localidadElegida.getCosto();

                if(comprador.getPresupuesto() < costo)
                {
                    System.out.println("El usuario no tiene suficiente presupuesto para adquirir estos boletos.\n");
                }
                else
                {
                    Venta(comprador, localidadElegida, costo);
                }
            }
            else
            {
                costo = comprador.getBoletosComprar() * localidadElegida.getCosto();
                if(comprador.getPresupuesto() < costo)
                {
                    System.out.println("El usuario no tiene suficiente presupuesto para adquirir estos boletos.\n");
                }
                else
                {
                    Venta(comprador, localidadElegida, costo);
                }
            }
        }
    }

    public static void Venta(Comprador comprador, Localidades localidad, int costo)
    {
        ganancias += costo;
        comprador.setPresupuesto(comprador.getPresupuesto() - costo);
        localidad.setCantidad(localidad.getCantidad()-comprador.getBoletosComprar());
        System.out.println("Venta realizada con exito. Gracias por su compra!!\n");
    }
}
