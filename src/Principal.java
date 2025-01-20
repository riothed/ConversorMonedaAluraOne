import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. La clase principal: Principal
Este es el corazón del programa. Aquí se encuentran:

El menú con las opciones de conversión.
La interacción con el usuario usando el teclado.
Las llamadas a la API para obtener los valores de las conversiones.

 */



public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaApiConversion consulta = new ConsultaApiConversion();
        String menu = """
                ***----------------------****
                Conversor De Monedas COQUITO:
                
                Elija una opción válida:
                1) Dólar =>> Euro
                2) Euro =>> Dólar
                3) Dólar =>> Yen japonés
                4) Yen japonés =>> Dólar
                5) Salir
                *******************************************************
                """;
        int opcionMenu = 0;
        long cantidadAConvertir = 0;
        Moneda moneda;

        while (opcionMenu != 5) {
            System.out.println(menu);
            try {
                opcionMenu = Integer.valueOf(lectura.nextLine());
                switch (opcionMenu) {
                    case 1:
                        System.out.println("Digite el valor a convertir:");
                        try {
                            cantidadAConvertir = Long.parseLong(lectura.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            System.out.println("Presione Enter para continuar...");
                            lectura.nextLine(); // Pausa para esperar "Enter".
                            continue; // Vuelve al menú si la entrada no es válida.
                        }
                        moneda = consulta.buscaConversionMoneda("USD", "EUR", cantidadAConvertir);
                        System.out.println("El valor " + cantidadAConvertir + " [" + moneda.base_code() + "] "
                                + "corresponde al valor final de " + moneda.conversion_result() +
                                " [" + moneda.target_code() + "]");
                        System.out.println("Presione Enter para continuar...");
                        lectura.nextLine(); // Pausa para esperar "Enter".
                        break;
                    case 2:
                        System.out.println("Digite el valor a convertir:");
                        try {
                            cantidadAConvertir = Long.parseLong(lectura.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            System.out.println("Presione Enter para continuar...");
                            lectura.nextLine(); // Pausa para esperar "Enter".
                            continue; // Vuelve al menú si la entrada no es válida.
                        }
                        moneda = consulta.buscaConversionMoneda("EUR", "USD", cantidadAConvertir);
                        System.out.println("El valor " + cantidadAConvertir + " [" + moneda.base_code() + "] "
                                + "corresponde al valor final de " + moneda.conversion_result() +
                                " [" + moneda.target_code() + "]");
                        System.out.println("Presione Enter para continuar...");
                        lectura.nextLine(); // Pausa para esperar "Enter".
                        break;
                    case 3:
                        System.out.println("Digite el valor a convertir:");
                        try {
                            cantidadAConvertir = Long.parseLong(lectura.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            System.out.println("Presione Enter para continuar...");
                            lectura.nextLine(); // Pausa para esperar "Enter".
                            continue; // Vuelve al menú si la entrada no es válida.
                        }
                        moneda = consulta.buscaConversionMoneda("USD", "JPY", cantidadAConvertir);
                        System.out.println("El valor " + cantidadAConvertir + " [" + moneda.base_code() + "] "
                                + "corresponde al valor final de " + moneda.conversion_result() +
                                " [" + moneda.target_code() + "]");
                        System.out.println("Presione Enter para continuar...");
                        lectura.nextLine(); // Pausa para esperar "Enter".
                        break;
                    case 4:
                        System.out.println("Digite el valor a convertir:");
                        try {
                            cantidadAConvertir = Long.parseLong(lectura.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            System.out.println("Presione Enter para continuar...");
                            lectura.nextLine(); // Pausa para esperar "Enter".
                            continue; // Vuelve al menú si la entrada no es válida.
                        }
                        moneda = consulta.buscaConversionMoneda("JPY", "USD", cantidadAConvertir);
                        System.out.println("El valor " + cantidadAConvertir + " [" + moneda.base_code() + "] "
                                + "corresponde al valor final de " + moneda.conversion_result() +
                                " [" + moneda.target_code() + "]");
                        System.out.println("Presione Enter para continuar...");
                        lectura.nextLine(); // Pausa para esperar "Enter".
                        break;

                    case 5:
                        System.out.println("Finalizando el programa. Muchas gracias por utilizar nuestros servicios.");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Ha ingresado un valor inválido. Intente nuevamente.");
                System.out.println("Presione Enter para continuar...");
                lectura.nextLine(); // Pausa para esperar "Enter".
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
    }
}
