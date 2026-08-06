public class Ejercicio7 {
    public static void main(String[] args) {

        int cantidadVendida = 5;                              // antes: "5" (texto, no numero)
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;      // antes: faltaba el punto y coma aqui

        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento) {                                 // antes: (aplicaDescuento = true)
            total = total - (total * 0.10);
        }

        System.out.println("Total: " + total);
    }
}
