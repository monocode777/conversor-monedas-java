*Conversor de Monedas en Java*
*Descripción del proyecto

Este proyecto es un conversor de monedas desarrollado en Java que utiliza una API externa para obtener tasas de cambio en tiempo real. El usuario puede seleccionar diferentes tipos de conversión, ingresar una cantidad y obtener el resultado calculado automáticamente. El programa funciona por consola y emplea las clases HttpClient y Gson para consumir y procesar la información proveniente del servicio externo.

*Funcionalidades

Menú interactivo para seleccionar tipos de conversión.

Conversión entre diferentes monedas.

Obtención de tasas reales desde la API ExchangeRate-API.

Ingreso de cantidades por consola.

Cálculo y presentación del resultado.

Arquitectura dividida por clases para mejor organización:

Main.java – Manejo del flujo principal y lógica del usuario.

Conversor.java – Interfaz del menú.

ExchangeRateService.java – Conexión con la API y obtención de tasas.

*Cómo usar el proyecto

Clonar este repositorio:

git clone https://github.com/tu-usuario/conversor-monedas-java.git


Abrir el proyecto en IntelliJ IDEA.

Asegurarse de tener instalada la librería Gson (o que el proyecto sea Maven).

Ejecutar la clase Main.java.

Seguir las instrucciones mostradas en la consola:

Seleccionar una opción de conversión.

Ingresar el monto a convertir.

Ver el resultado calculado con la tasa actualizada.

Dónde encontrar ayuda

En caso de dudas o problemas, se pueden consultar:

*Documentación oficial de Java:
https://docs.oracle.com/en/java/

*Documentación de ExchangeRate-API:
https://www.exchangerate-api.com/

*Documentación de Gson:
https://github.com/google/gson

También se pueden abrir issues en el repositorio para soporte adicional.

*Autores

Edgar Mojica
Desarrollador del proyecto, implementación del código y estructura principal.
