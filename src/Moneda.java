/*
3. La clase Moneda
Esta clase es como una cajita que guarda tres datos importantes:

La moneda base (ejemplo: USD).
La moneda objetivo (ejemplo: EUR).
El resultado de la conversión.
 */

public record Moneda(String base_code
        ,String target_code
        ,float conversion_result) {
}
