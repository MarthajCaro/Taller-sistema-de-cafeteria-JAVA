public class Ejercicio5 {
    public static void main(String[] args) {

        // Como no usamos Scanner, simulamos los "intentos" del cajero con un array:
        // el primer valor es inválido a propósito, para forzar al menos una repetición
        double[] intentosCajero = {-5000, 0, 20000};
        int indiceIntento = 0;
        double montoApertura;

        // do-while: el bloque se ejecuta SIEMPRE al menos una vez,
        // sin importar si la condición es verdadera o falsa desde el inicio
        do {
            montoApertura = intentosCajero[indiceIntento];
            indiceIntento++;

            if (montoApertura <= 0) {
                System.out.println("Monto inválido ($" + montoApertura + "). Debe ser mayor a $0. Intentando de nuevo...");
            }

        } while (montoApertura <= 0);

        System.out.println("Caja abierta correctamente con un monto de $" + montoApertura);
    }
}

