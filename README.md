# Taller: Sistema de Cafetería

Este repositorio contiene la solución al taller de lógica de programación en Java: 7 ejercicios cortos por tema (Parte 1) y un sistema completo de procesamiento de pedidos de cafetería (Parte 2).

## Estructura del proyecto

---

## Parte 1 — Respuestas escritas

### Ejercicio 1 — Variables y tipos de dato

**Pregunta:** ¿Por qué usas `double` para el precio y no `int`? ¿Qué pasaría si declaras el precio como `int` y le asignas 3.50?

**Respuesta:** Usamos `double` porque el precio puede tener decimales (ej: 3500.50), y un `int` solo puede representar números enteros, sin parte decimal. Si declaras `int precio = 3.50;`, Java no deja compilar el programa: marca un error de compilación (*incompatible types: possible lossy conversion from double to int*), porque 3.50 es un literal de tipo `double`, y asignarlo directo a un `int` perdería la parte decimal sin que se haya pedido explícitamente.

### Ejercicio 2 — Operadores

**Pregunta:** ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador?

**Respuesta:** Se usó el operador relacional `>` (mayor que) para comparar el subtotal contra el monto mínimo ($30.000). Este tipo de operadores (`>`, `<`, `>=`, `<=`, `==`, `!=`) siempre devuelven un valor de tipo `boolean` (`true` o `false`), porque su trabajo es responder una pregunta de sí/no.

### Ejercicio 3 — switch

**Pregunta:** ¿En qué situación preferirías usar `switch` en lugar de una cadena de `if-else`? ¿Hay algún caso en este ejercicio donde el `switch` no sería la mejor opción?

**Respuesta:** Se prefiere `switch` cuando se compara una sola variable contra varios valores exactos y discretos (como `'B'`, `'F'`, `'C'`, `'P'`) — es más fácil de leer que una cadena larga de `if / else if`. El `switch` no sería buena opción si en vez de valores exactos se necesitara comparar rangos o condiciones más complejas (por ejemplo, un rango de precio), ya que `switch` solo compara igualdad exacta, no rangos.

### Ejercicio 4 — while

**Pregunta:** ¿Qué ocurre si la condición del `while` nunca se vuelve falsa? ¿Cómo lo prevendrías en este caso?

**Respuesta:** El programa entra en un "bucle infinito": se ejecuta para siempre sin avanzar ni terminar, hasta que se cuelgue o se detenga manualmente. En este ejercicio se previene asegurando que `inventario` siempre cambie dentro del bucle, y que ese cambio vaya en la dirección que necesita la condición para volverse falsa algún día.

### Ejercicio 5 — do-while

**Pregunta:** ¿Por qué `do-while` es más apropiado que `while` aquí? Describe con tus palabras la diferencia en el orden de ejecución.

**Respuesta:** `do-while` es más apropiado porque siempre se necesita pedirle al cajero el monto de apertura al menos una vez, sin importar si el primer valor es válido. La diferencia clave está en el orden: en un `while`, primero se revisa la condición y solo si es verdadera se ejecuta el bloque. En un `do-while`, primero se ejecuta el bloque, y al final se revisa la condición — por eso garantiza mínimo una ejecución.

### Ejercicio 6 — for y arrays

**Pregunta:** ¿Por qué usas `for` aquí y no `while`? ¿Qué tiene el `for` que lo hace más conveniente cuando conoces el número de elementos?

**Respuesta:** Se usa `for` porque desde el inicio se sabe exactamente cuántas veces se necesita repetir el bloque: tantas veces como elementos tenga el array (`productos.length`). El `for` junta las 3 partes clave del bucle en una sola línea: dónde empieza el contador, hasta cuándo se repite, y cómo avanza en cada vuelta — con un `while` esas partes quedarían separadas en distintos lugares del código, más fácil de desordenar u olvidar.

### Ejercicio 7 — Debugging

**Pregunta:** ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error lógico? ¿Cómo los distingues?

**Respuesta:** Se encontraron 3 errores:

1. `int cantidadVendida = "5";` → **error de compilación**. Un `String` no se puede asignar a un `int`; el programa no llega a ejecutarse.
2. Faltaba un punto y coma después de `double total = cantidadVendida * precioUnitario` → **error de compilación** (sintaxis). El compilador no puede identificar dónde termina la instrucción.
3. `if (aplicaDescuento = true)` → **error lógico**, no de compilación. Se usó `=` (asignación) en vez de `==` (comparación). Como `aplicaDescuento` ya es `boolean`, Java sí permite compilar esta línea, pero el efecto es que siempre asigna `true` y siempre entra al `if`, sin importar el valor real del total.

Los errores de compilación los detecta el IDE antes de ejecutar el programa (subrayado en rojo). Los errores lógicos el programa los ejecuta sin quejarse, pero el resultado es incorrecto — solo se detectan revisando el resultado con casos de prueba.

---

## Parte 2 — Sistema de turno de cafetería

`SistemaCafeteria.java` simula un turno completo: apertura de caja (`do-while`), procesamiento de 6 pedidos con validación de inventario y descuentos (`for` + `switch`), y un reporte de cierre con el total recaudado y el pedido de mayor valor.

## Cómo ejecutar

Cada clase tiene su propio método `main`. En IntelliJ: clic derecho sobre el archivo → **Run**.

---

*Taller desarrollado como parte del bootcamp Generation Colombia — Junior Full Stack Java.*