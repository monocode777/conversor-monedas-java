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

 Abrir el proyecto en IntelliJ IDEA.
2. Asegurarse de que la biblioteca Gson está instalada  
   (o agregarla manualmente en `Project Structure > Libraries`).
3. Ejecutar el archivo `Main.java`.
4. Seguir las instrucciones en la consola:
   - Seleccionar la opción de conversión.
   - Ingresar el monto deseado.
   - Visualizar el resultado con la tasa actualizada.

---

## Dónde obtener ayuda

En caso de dudas o problemas, puede consultar:

- Documentación oficial de Java:  
  https://docs.oracle.com/en/java/

- Documentación de ExchangeRate-API:  
  https://www.exchangerate-api.com/

- Documentación de Gson:  
  https://github.com/google/gson

También puede abrir un *issue* en este repositorio para solicitar soporte.

---

## Autores

- **Edgar Mojica**  
  Desarrollador del proyecto y creador de la implementación principal.
