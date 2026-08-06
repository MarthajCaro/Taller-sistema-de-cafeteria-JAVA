public class Ejercicio3 {
    public static void main(String[] args) {

        char categoria = 'F'; // cambia este valor para probar los otros casos

        String descripcion;
        double porcentajeIva;

        switch (categoria) {
            case 'B':
                descripcion = "Bebida caliente";
                porcentajeIva = 0;
                break;
            case 'F':
                descripcion = "Bebida fría";
                porcentajeIva = 5;
                break;
            case 'C':
                descripcion = "Comida";
                porcentajeIva = 8;
                break;
            case 'P':
                descripcion = "Postre";
                porcentajeIva = 8;
                break;
            default:
                descripcion = "Categoría no reconocida";
                porcentajeIva = 0;
                break;
        }

        System.out.println("Categoría: " + descripcion);
        System.out.println("IVA aplicado: " + porcentajeIva + "%");
    }
}
