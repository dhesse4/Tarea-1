import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria("Daniel Hesse", 186526, 5500.00);    
        CuentaBancaria cuenta2 = new CuentaBancaria("Dela Gomez", 605987, 3000.00);

        int conteo = 0;
        int cuenta = 0;
        double monto = 0;
       

        while (conteo != 4) 
        {
            System.out.println("1. Retirar de la cuenta");
            System.out.println("2. Depositar en la cuenta");
            System.out.println("3. Obtener Informacion de la cuenta");
            System.out.println("4. Salir del programa");
            System.out.print("Ingresa la opcion que deseas realizar: ");
            conteo = scan.nextInt();

            if (conteo == 1) 
            {
                System.out.print("Que cuenta deseas modificar 1.Cuenta1 2.Cuenta2: ");
                cuenta = scan.nextInt();
                System.out.print("Ingresa el monto a retirar: ");
                monto = scan.nextDouble();
                if (cuenta == 1) 
                {
                cuenta1.retirar(monto);
                } 
                else if (cuenta == 2) 
                {
                cuenta2.retirar(monto);
                } 
                else System.out.println("Cuenta inválida.");
            }

            else if (conteo == 2) 
            {
                System.out.print("Que cuenta deseas modificar 1.Cuenta1 2.Cuenta2: ");
                cuenta = scan.nextInt();
                System.out.print("Ingresa el monto a depositar: ");
                monto = scan.nextDouble();
                if (cuenta == 1) 
                {
                cuenta1.depositar(monto);
                } 
                else if (cuenta == 2) 
                {
                cuenta2.depositar(monto);
                } 
                else System.out.println("Cuenta inválida.");
            }

            else if (conteo == 3) 
            {
                System.out.print("Que cuenta deseas modificar 1.Cuenta1 2.Cuenta2: ");
                cuenta = scan.nextInt();
                if (cuenta == 1) 
                {
                cuenta1.getInfo();;
                } 
                else if (cuenta == 2) 
                {
                cuenta2.getInfo();;
                } 
                else System.out.println("Cuenta inválida.");
            }
        }

        scan.close();
    }    
}
