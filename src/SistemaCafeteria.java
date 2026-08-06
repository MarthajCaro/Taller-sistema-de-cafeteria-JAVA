public class SistemaCafeteria {
    public static void main(String[] args) {

        // ===== Datos del negocio =====
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida, P=Postre

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // indice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        int inventarioBrownie = 10; // indice 4 del menu

        // ===== Tarea 4 — Apertura de turno (do-while) =====
        double[] intentosApertura = {-2000, 50000}; // primero invalido, luego valido a proposito
        int indiceIntento = 0;
        double montoApertura;

        System.out.println("=== APERTURA DE TURNO ===");
        do {
            montoApertura = intentosApertura[indiceIntento];
            indiceIntento++;

            if (montoApertura <= 0) {
                System.out.println("Monto invalido ($" + montoApertura + "). Debe ser mayor a $0. Reintentando...");
            }
        } while (montoApertura <= 0);

        System.out.println("Caja abierta con $" + montoApertura);
        System.out.println();

        // ===== Variables para el reporte final (Tarea 5) =====
        int pedidosProcesados = 0;
        double totalRecaudado = 0;
        int numeroPedidoMayorValor = -1;
        double valorPedidoMayor = -1;

        System.out.println("=== PROCESAMIENTO DE PEDIDOS ===");

        // ===== Tareas 1, 2 y 3 — un solo for, sin ciclos anidados =====
        for (int i = 0; i < pedidoProducto.length; i++) {

            int idxProducto = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];

            String nombreProducto = nombres[idxProducto];
            double precioProducto = precios[idxProducto];
            char categoria = categorias[idxProducto];

            System.out.println("Pedido #" + (i + 1));
            System.out.println("  Producto: " + nombreProducto);
            System.out.println("  Cantidad: " + cantidad);

            // --- Tarea 1: descripcion de categoria con switch ---
            String descripcionCategoria;
            switch (categoria) {
                case 'B':
                    descripcionCategoria = "Bebida caliente";
                    break;
                case 'F':
                    descripcionCategoria = "Bebida fria";
                    break;
                case 'C':
                    descripcionCategoria = "Comida";
                    break;
                case 'P':
                    descripcionCategoria = "Postre";
                    break;
                default:
                    descripcionCategoria = "Categoria no reconocida";
                    break;
            }
            System.out.println("  Categoria: " + descripcionCategoria);

            // --- Tarea 3: validacion de inventario (solo aplica al Brownie, indice 4) ---
            if (idxProducto == 4) {
                if (cantidad > inventarioBrownie) {
                    System.out.println("  Producto agotado: no hay suficiente Brownie en inventario. Pedido no cobrado.");
                    System.out.println();
                    continue; // saltamos el resto del procesamiento de este pedido, sin anidar otro ciclo
                } else {
                    inventarioBrownie -= cantidad;
                }
            }

            // --- Subtotal ---
            double subtotal = precioProducto * cantidad;

            // --- Tarea 2: descuento si el subtotal supera $12.000 ---
            boolean aplicaDescuento = subtotal > 12000;
            double totalPedido = subtotal;
            if (aplicaDescuento) {
                totalPedido = subtotal - (subtotal * 0.10);
            }

            System.out.printf("  Subtotal: $%.2f%n", subtotal);
            System.out.println("  ¿Aplica descuento? " + (aplicaDescuento ? "Si" : "No"));
            System.out.printf("  Total del pedido: $%.2f%n", totalPedido);
            System.out.println();

            // --- Acumulados para el reporte final ---
            pedidosProcesados++;
            totalRecaudado += totalPedido;

            if (totalPedido > valorPedidoMayor) {
                valorPedidoMayor = totalPedido;
                numeroPedidoMayorValor = i + 1;
            }
        }

        // ===== Tarea 5 — Reporte de cierre =====
        System.out.println("=== REPORTE DE CIERRE ===");
        System.out.println("Total de pedidos procesados: " + pedidosProcesados);
        System.out.printf("Total recaudado: $%.2f%n", totalRecaudado);
        System.out.println("Pedido con mayor valor: #" + numeroPedidoMayorValor + " ($" + valorPedidoMayor + ")");
    }
}


