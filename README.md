# Juego de Traducción

Este proyecto implementa un juego de traducción en el que el jugador debe adivinar la traducción al inglés de palabras en español. El juego carga las palabras desde un archivo JSON y permite al jugador intentar adivinarlas una por una.

## Requisitos

- Java 8 o superior
- Maven (opcional, para construir y gestionar dependencias)

## Instalación y Uso

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tu_usuario/juego-traduccion.git
    ```

2. Abre el proyecto en tu IDE preferido.

3. Ejecuta la clase `Main` para comenzar el juego.

    ```bash
    cd juego-traduccion
    mvn compile
    mvn exec:java -Dexec.mainClass=org.example.Main
    ```

4. Sigue las instrucciones en pantalla para jugar. Ingresa la traducción en inglés de la palabra en español que se muestra y presiona Enter para continuar. Si deseas salir del juego, presiona 'P'.

## Configuración

- El archivo `palabras.json` contiene las palabras en español y sus traducciones en inglés. Puedes editar este archivo para cambiar las palabras utilizadas en el juego.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes alguna mejora, no dudes en abrir un issue o enviar un pull request.

## Licencia

Este proyecto está bajo la [Licencia MIT](LICENSE).
