public class Ejercicio2 {
    public static void main(String[] args) {

        double subtotal = 42500;
        double porcentajeDescuento = 0.15;
        double montoMinimoDescuento = 30000;

        // Operador relacional (>) : compara y devuelve un boolean
        boolean tieneDescuento = subtotal > montoMinimoDescuento;

        // Si tiene descuento, lo calculamos; si no, el descuento es 0
        double valorDescuento = tieneDescuento ? subtotal * porcentajeDescuento : 0;
        double totalPagar = subtotal - valorDescuento;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Valor del descuento: $%.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        System.out.printf("¿Tiene derecho a descuento?: %b%n", tieneDescuento);
    }
}
