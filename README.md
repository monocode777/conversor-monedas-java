# Conversor de Monedas en Java

## Descripción del proyecto
Este proyecto es un conversor de monedas desarrollado en Java que utiliza una API externa para obtener tasas de cambio en tiempo real. El programa permite convertir diferentes monedas ingresando un monto y seleccionando la opción deseada desde un menú interactivo por consola. Se emplean `HttpClient` para realizar la solicitud HTTP y `Gson` para procesar la respuesta JSON de la API.

---

## Funcionalidades

- Menú interactivo para seleccionar el tipo de conversión.
- Conversión entre varias monedas utilizando tasas reales.
- Conexión a la API ExchangeRate-API.
- Ingreso de valores por consola.
- Cálculo automático del resultado.
- Organización del proyecto en clases:
  - `Main.java`: flujo principal del programa.
  - `Conversor.java`: impresión del menú.
  - `ExchangeRateService.java`: conexión y consumo de la API.

---

## Cómo usar el proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas-java.git
