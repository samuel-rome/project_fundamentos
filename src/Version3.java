import java.util.Scanner;

public class Version3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos de los planes
        double[] precios = {500, 850, 1300};
        double[][] descuentos = {
                {10, 20, 25},
                {15, 35, 40},
                {20, 40, 50}
        };

        int duracionContrato = obtenerDuracionContrato(scanner);
        int opcionPlan = obtenerOpcionPlan(scanner);

        // Calcular precio final
        double descuento = calcularDescuento(descuentos, opcionPlan, duracionContrato);
        double precioFinal = calcularPrecioFinal(precios, opcionPlan, descuento);

        // Mostrar precio final
        mostrarPrecioFinal(precioFinal);
    }

    // Método para obtener la duración del contrato
    public static int obtenerDuracionContrato(Scanner scanner) {
        System.out.println("Ingrese la duración del contrato en años (1, 2 o 3):");
        return scanner.nextInt();
    }

    // Método para obtener la opción del plan
    public static int obtenerOpcionPlan(Scanner scanner) {
        System.out.println("Seleccione el plan (1: Starter, 2: Premium, 3: Enterprise):");
        return scanner.nextInt();
    }

    // Método para calcular el descuento
    public static double calcularDescuento(double[][] descuentos, int opcionPlan, int duracionContrato) {
        return descuentos[opcionPlan - 1][duracionContrato - 1];
    }

    // Método para calcular el precio final
    public static double calcularPrecioFinal(double[] precios, int opcionPlan, double descuento) {
        double precioRegular = precios[opcionPlan - 1];
        return precioRegular * (1 - descuento / 100);
    }

    // Método para mostrar el precio final
    public static void mostrarPrecioFinal(double precioFinal) {
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }
}
