import java.util.Scanner;

public class Tarea_1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Ingresa de cuantos numeros va a ser el array: ");
        int cantidad = scan.nextInt();

        int array[] = new int[cantidad];

        for(int i = 0; i < cantidad; i++)
        {
            System.out.print("Ingresa un numero que desees: ");
            array[i] = scan.nextInt();
        }
        
        System.out.print("Ingresa que deseas hacer con el array deseas obtener 1. Numero Mayor 2. Numero Menor 3.Ordenar: ");
        int decision = scan.nextInt();

        if(decision == 1) System.out.print("El numero mayor del array es: " + mayorMenor(array, cantidad, decision));
        else if (decision==2) System.out.print("El numero menor del array es:" + mayorMenor(array, cantidad, decision));
        else ordenarArray(array, cantidad);

        scan.close();
        
    }

    public static int mayorMenor(int numeros[], int cantidad, int decision)
    {
        int temporal = 0;

        for(int i = 0; i < cantidad - 1; i++)
        {
            for (int j = 0; j < cantidad - i - 1; j++) 
            {
                if (numeros[j] > numeros[j + 1]) 
                {
                    temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }

        if(decision == 1) return numeros[cantidad-1];
        else return numeros[0];

    }

    public static void ordenarArray(int numeros[], int cantidad)
    {
        int temporal = 0;

        for(int i = 0; i < cantidad - 1; i++)
        {
            for (int j = 0; j < cantidad - i - 1; j++) 
            {
                if (numeros[j] > numeros[j + 1]) 
                {
                    temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }


        System.out.println("Array ordenado de menor a mayor: \n");
        for(int i = 0; i < cantidad; i++)
        {
            System.out.println(numeros[i]);
            System.out.println(" ");
        }

    }
}