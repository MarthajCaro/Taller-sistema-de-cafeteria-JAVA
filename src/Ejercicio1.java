public class Ejercicio1 {
    public static void main(String[] args) {

        // Declaramos una variable por cada tipo de dato pedido
        String nombreProducto = "Capuchino";
        double precioUnitario = 5000.0;   // double: puede tener decimales
        int cantidadInventario = 25;      // int: siempre entero, sin decimales
        boolean disponibleHoy = true;     // boolean: solo true o false
        char codigoProducto = 'B';        // char: UN solo caracter, entre comillas simples

        // Imprimimos cada una con una etiqueta clara usando String.format
        System.out.println(String.format("Producto: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: $%.2f", precioUnitario));
        System.out.println(String.format("Cantidad en inventario: %d unidades", cantidadInventario));
        System.out.println(String.format("¿Disponible hoy?: %b", disponibleHoy));
        System.out.println(String.format("Código de producto: %c", codigoProducto));
    }
}