#🌐 ¿Qué hace este código?
Este es un conversor de monedas que utiliza datos de una API para convertir valores entre diferentes monedas, como dólares, pesos y reales. 🏦💱

El programa:

Muestra un menú para elegir monedas.
Pregunta cuánto dinero quieres convertir.
Llama a una API (un servicio en internet) para obtener el valor actualizado.
Muestra el resultado de la conversión en pantalla. 🎉

##📖 Partes importantes del programa
###1. La clase principal: Principal
Este es el corazón 💖 del programa. Aquí se encuentran:

El menú con las opciones de conversión.
La interacción con el usuario usando el teclado.
Las llamadas a la API para obtener los valores de las conversiones.

###2. La API: ConsultaApiConversion
Esta clase es como un mensajero 📬. Va a la API para buscar la información que necesitamos:

Construye una URL: para pedir el valor de la conversión.
Envía la solicitud: usando HttpClient.
Lee la respuesta: en formato JSON y la convierte en un objeto que el programa pueda entender (Moneda).

###3. La clase Moneda
Esta clase es como una cajita 📦 que guarda tres datos importantes:

La moneda base (ejemplo: USD).
La moneda objetivo (ejemplo: ARS).
El resultado de la conversión.

###Para Ejecutar el programa
Descarga el Json del siguiente link y ponerlo en la carpeta descargas
`<link>` : https://mvnrepository.com/artifact/com.google.code.gson/gson
