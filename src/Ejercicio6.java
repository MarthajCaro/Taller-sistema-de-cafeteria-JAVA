public class Ejercicio6 {
    public static void main(String[] args) {

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double sumaPrecios = 0;

        System.out.println("=== Menú del día ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            sumaPrecios += precios[i]; // vamos acumulando para el promedio
        }

        double promedio = sumaPrecios / productos.length;
        System.out.printf("Precio promedio del menú: $%.2f%n", promedio);
    }
}
