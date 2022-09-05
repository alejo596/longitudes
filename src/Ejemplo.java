import java.util.*;
public class Ejemplo
{
    static Scanner console = new Scanner(System.in);
    static final double CENTIMETROS_POR_PULGADA = 2.54;
    static final int PULGADAS_POR_PIE = 12;
    public static void main(String[] args)
    {
        int pies;
        int pies2=2;
        int pulgadas;
        int totalPulgadas;
        double centimetros;
        System.out.print("Ingrese pies: ");
        pies = console.nextInt();
        System.out.println("--------------------------");
        System.out.print("Ingrese pulgadas: ");
        pulgadas = console.nextInt();
        System.out.println("--------------------------");
        System.out.println("Los numeros que ingreso son "+ pies + " para pies y "
                + pulgadas + " para pulgadas.");
        totalPulgadas = PULGADAS_POR_PIE * pies + pulgadas+pies2;
        System.out.println("--------------------------");
        System.out.println("El numero total de pulgadas = " + totalPulgadas);
        centimetros = totalPulgadas * CENTIMETROS_POR_PULGADA;
        System.out.println("El numero de centimetros = "+ centimetros);

    }
}
