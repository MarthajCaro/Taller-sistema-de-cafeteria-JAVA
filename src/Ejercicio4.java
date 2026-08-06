public class Ejercicio4 {
    public static void main(String[] args) {

        int inventario = 50;
        int consumoPorPedido = 3; // valor fijo, entre 1 y 3
        int numeroPedido = 1;

        // Mientras el inventario NO haya bajado de 10, seguimos simulando pedidos
        while (inventario >= 10) {
            inventario = inventario - consumoPorPedido;
            System.out.println("Pedido #" + numeroPedido + " procesado. Inventario restante: " + inventario);
            numeroPedido++;
        }

        System.out.println("Inventario bajo de 10 unidades. Se detiene la simulación.");
    }
}

