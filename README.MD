# Descripción del Proyecto "Juego Traductor English-Spanish"

El proyecto "Juego Traductor English-Spanish" es un juego interactivo de adivinanzas diseñado para ayudar a mejorar el vocabulario en inglés y español. El juego presenta al usuario una lista de palabras en español y le pide que adivine su traducción al inglés.

El código está escrito en Java y consta de cuatro clases principales:

## Clase `Main`

La clase `Main` contiene el método principal `main` que inicializa el juego. Primero, construye la ruta del archivo `palabras.json` utilizando la ubicación del directorio de trabajo actual y luego crea una instancia del juego `JuegoAdivinanza` utilizando esta ruta. Finalmente, inicia el juego llamando al método `iniciarJuego` y muestra un mensaje de despedida.

## Clase `CargadorPalabras`

La clase `CargadorPalabras` es responsable de cargar las palabras desde un archivo JSON. Contiene un método estático `cargarPalabrasDesdeJSON` que recibe la ruta del archivo JSON como parámetro y devuelve una lista de palabras. Utiliza la biblioteca Gson para leer el archivo JSON y mapearlo a un mapa de palabras clave y valores. Luego, itera sobre el mapa y crea objetos `Palabra` para cada entrada en el mapa.

## Clase `JuegoAdivinanza`

La clase `JuegoAdivinanza` representa el juego en sí. Al construir un objeto `JuegoAdivinanza`, se carga una lista de palabras utilizando la clase `CargadorPalabras`, y se barajan para asegurar una variedad en cada partida. El método `iniciarJuego` maneja la lógica principal del juego, solicitando al usuario que adivine la traducción de las palabras y verificando si las respuestas son correctas. El juego continúa hasta que todas las palabras hayan sido adivinadas o hasta que el usuario decida salir.

## Clase `Palabra`

La clase `Palabra` representa una palabra en el juego, con dos atributos: el término en español y su traducción al inglés. Tiene un constructor para inicializar estos atributos y métodos de acceso para obtener los valores de los atributos.

## Funcionamiento del Juego

El juego muestra al usuario una lista de palabras en español y le pide que adivine su traducción al inglés. El usuario puede ingresar la traducción deseada o presionar 'P' para salir del juego. Después de cada intento, el juego verifica si la respuesta es correcta y muestra un mensaje correspondiente. El juego continúa hasta que todas las palabras hayan sido adivinadas o hasta que el usuario decida salir.

## Requisitos y Dependencias

El proyecto depende de la biblioteca Gson para la manipulación de archivos JSON. Asegúrate de tener la biblioteca Gson agregada a tu proyecto para que el código funcione correctamente.

Este documento proporciona una visión general del proyecto y explica cómo se estructura y cómo funciona cada componente. Si necesitas más detalles sobre alguna parte específica del código o tienes alguna pregunta, no dudes en preguntar.
